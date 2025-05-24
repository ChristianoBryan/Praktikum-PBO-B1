package service;

import model.Mahasiswa;
import utilities.MySQLUtilities;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MySQLMahasiswaService() {
        koneksi = MySQLUtilities.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa(id, nama) VALUES(?,?)";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("Insert berhasil");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal insert : " + sqle.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup prepared statement : " + sqle.getMessage());
            }
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("Update berhasil");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal update : " + sqle.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup prepared statement : " + sqle.getMessage());
            }
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id=?";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("Delete berhasil");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal delete : " + sqle.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup prepared statement : " + sqle.getMessage());
            }
        }
    }

    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Mahasiswa mhs = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            } else {
                System.out.println("Data dengan id " + id + " tidak ditemukan");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal getById : " + sqle.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup resources : " + sqle.getMessage());
            }
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        String query = "SELECT * FROM mahasiswa";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            ps = koneksi.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMhs.add(mhs);
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal getAll : " + sqle.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup resources : " + sqle.getMessage());
            }
        }
        return listMhs;
    }
    
    public void indexReset() {
        List<Mahasiswa> allMhs = getAll(); // Assume ordered by ID
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/pbo11?useSSL=false&serverTimezone=UTC", "root", "")) {
            conn.setAutoCommit(false); // For transaction
            Statement stmt = conn.createStatement();
            stmt.execute("SET @new_id = 0;");
            stmt.executeUpdate("UPDATE mahasiswa SET id = (@new_id := @new_id + 1) ORDER BY id;");
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
    }
    }

    public boolean isEmpty() {
        String query = "SELECT COUNT(*) AS total FROM mahasiswa";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                return rs.getInt("total") == 0;
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal memeriksa tabel: " + sqle.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup resources: " + sqle.getMessage());
            }
        }
        return true;
    }

    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi database berhasil ditutup");
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup koneksi: " + sqle.getMessage());
            } finally {
                koneksi = null;
            }
        }
    }
}