package com.innovator.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.innovator.model.Personne;

public class DaoPersonne {

    public ArrayList<Personne> selectByNom(String nom) throws ClassNotFoundException, SQLException {
        ArrayList<Personne> liste = new ArrayList<Personne>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "select  * from personnes where nom ='" + nom + "'";

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Personne p = new Personne();
            p.setAge(rs.getInt("age"));
            p.setId(rs.getInt("id"));
            p.setNom(rs.getString("nom"));
            p.setPrenom("prenom");

            liste.add(p);
        }
        conn.close();
        return liste;
    }

    public Personne selectById(int id) throws ClassNotFoundException, SQLException {
        Personne p = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "select  * from personnes where id = " + id;

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            p = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"));
        }

        conn.close();
        return p;
    }

    public void insert(Personne p)
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "insert into personnes values (?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, p.getId());
        ps.setString(2, p.getNom());
        ps.setString(3, p.getPrenom());
        ps.setInt(4, p.getAge());
        ps.executeUpdate();
        // System.out.println(sql);
        conn.close();
    }

    public void update(Personne p) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "update  personnes set nom='" + p.getNom() + "',prenom='" + p.getPrenom() + "',age=" + p.getAge()
                + " where id=" + p.getId();

        Statement st = conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
        conn.close();
    }

    public void delete(Personne p) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "delete from personnes where id=" + p.getId();

        Statement st = conn.createStatement();
        st.executeUpdate(sql);

        conn.close();
    }

    public ArrayList<Personne> select() throws ClassNotFoundException, SQLException {
        ArrayList<Personne> liste = new ArrayList<Personne>();
        String res = "ID\tNOM\tPRENOM\tAGE\n";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
        String sql = "select  * from personnes";

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Personne p = new Personne();
            p.setAge(rs.getInt("age"));
            p.setId(rs.getInt("id"));
            p.setNom(rs.getString("nom"));
            p.setPrenom("prenom");

            liste.add(p);
        }
        // res += rs.getInt("id") + " " + "\t" + rs.getString("nom") + "\t" +
        // rs.getString("prenom") + "\t"
        // + rs.getInt("age") + "\n";

        conn.close();
        return liste;
    }

}
