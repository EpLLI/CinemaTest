package testZ.cinema.service;

import testZ.cinema.domain.Director;
import testZ.cinema.domain.Film;
import testZ.cinema.repository.PostgresSelect;

import java.sql.*;
import java.util.List;

public class FilmService {
    PostgresSelect p = new PostgresSelect();

    public Object SeD(Connection con, Integer id) throws SQLException, SQLException {
        return p.SeD(con, id);
    }

    public List<Director> SeAD(Connection con) throws SQLException, SQLException {

        return p.SeAD(con);
    }

    public List<Film> SeF(Connection con, Integer id) throws SQLException, SQLException {
        return p.SeF(con, id);
    }

    public List<Film> SeFDate(Connection con, String date1, String date2) throws SQLException, SQLException {

        return p.SeFDate(con, date1, date2);
    }

    public List<Film> SeFDirandDate(Connection con, String date1, String date2, Integer id) throws SQLException, SQLException {

        return p.SeFDirandDate(con, date1, date2, id);
    }
}
