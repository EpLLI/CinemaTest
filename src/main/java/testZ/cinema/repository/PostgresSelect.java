package testZ.cinema.repository;

import testZ.cinema.domain.Director;
import testZ.cinema.domain.Film;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PostgresSelect {


    public Object SeD(Connection con, Integer id) throws SQLException, SQLException {
        PreparedStatement stmt = con.prepareStatement("Select first_name,last_name,birth_date from director where id=(?)");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Director dr = new Director();
        while (rs.next()) {
            dr.setFirst_name(rs.getString("first_name"));
            dr.setLast_name(rs.getString("last_name"));
            dr.setBirth_date(rs.getString("birth_date"));
        }
        rs.close();
        stmt.close();
        con.close();
        return dr;
    }

    public List<Director> SeAD(Connection con) throws SQLException, SQLException {
        List dirs = new LinkedList();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Director");
        while (rs.next()) {
            Director dr = new Director();
            dr.setId(rs.getInt("id"));
            dr.setFirst_name(rs.getString("first_name"));
            dr.setLast_name(rs.getString("last_name"));
            dr.setBirth_date(rs.getString("birth_date"));
            dirs.add(dr);
        }
        rs.close();
        stmt.close();
        con.close();
        return dirs;
    }

    public List<Film> SeF(Connection con, Integer id) throws SQLException, SQLException {
        List films = new LinkedList();
        PreparedStatement stmt = con.prepareStatement("Select name, genre, release_date from film where director_id=?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Film fm = new Film();
            fm.setName(rs.getString("name"));
            fm.setDate(rs.getString("release_date"));
            fm.setGenre(rs.getString("genre"));
            films.add(fm);
        }
        rs.close();
        stmt.close();
        con.close();
        return films;
    }

    public List<Film> SeFDate(Connection con, String date1, String date2) throws SQLException, SQLException {
        List films = new LinkedList();
        PreparedStatement stmt = con.prepareStatement("Select name, genre, release_date" +
                " from film " +
                "where release_date>to_date(?,'YYYY MM  DD')" +
                "and release_date<to_date(?,'YYYY MM  DD')");
        stmt.setString(1, date1);
        stmt.setString(2, date2);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Film fm = new Film();
            fm.setName(rs.getString("name"));
            fm.setDate(rs.getString("release_date"));
            fm.setGenre(rs.getString("genre"));
            films.add(fm);
        }
        rs.close();
        stmt.close();
        con.close();
        return films;
    }

    public List<Film> SeFDirandDate(Connection con, String date1, String date2, Integer id) throws SQLException, SQLException {
        List films = new LinkedList();
        PreparedStatement stmt = con.prepareStatement("Select name, genre, release_date" +
                " from film " +
                "where release_date>to_date(?,'YYYY MM  DD')" +
                "and release_date<to_date(?,'YYYY MM  DD')" +
                "and director_id=?");
        stmt.setString(1, date1);
        stmt.setString(2, date2);
        stmt.setInt(3, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Film fm = new Film();
            fm.setName(rs.getString("name"));
            fm.setDate(rs.getString("release_date"));
            fm.setGenre(rs.getString("genre"));
            films.add(fm);
        }
        rs.close();
        stmt.close();
        con.close();
        return films;
    }
}
