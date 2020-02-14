package testZ.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import testZ.cinema.config.Connection;
import testZ.cinema.domain.Director;
import testZ.cinema.domain.Film;
import testZ.cinema.repository.PostgresSelect;
import testZ.cinema.service.FilmService;


import java.sql.*;
import java.util.List;

@Controller
public class HomeController {

    private PostgresSelect sql = new PostgresSelect();
    private FilmService fs=new FilmService();
    Connection c = new Connection();

    @RequestMapping(value = "/")
    public String Welcom() {
        return "welcome";
    }


    @RequestMapping(value = "/director", method = RequestMethod.POST)
    public String getDirectPage(Model model) throws SQLException, ClassNotFoundException {
        List<Director> dirs = fs.SeAD(c.connect());
        model.addAttribute("dirList", dirs);
        return "director";
    }

    @RequestMapping(value = "/filmbydirid", method = RequestMethod.POST)
    public String getFilmPage(@ModelAttribute("id") Integer id, Model model) throws SQLException, ClassNotFoundException {
        List<Film> films = fs.SeF(c.connect(), id);
        Director dr = (Director) fs.SeD(c.connect(), id);
        model.addAttribute("filmList", films);
        model.addAttribute("dir", dr);
        return "films";
    }

    @RequestMapping(value = "/date")
    public String Date() {
        return "DateSerch";
    }

    @RequestMapping(value = "/filmbydate", method = RequestMethod.GET)
    public String getFilmDate(@ModelAttribute("date1") String date, @ModelAttribute("date2") String date2, Model model) throws SQLException, ClassNotFoundException {
        List<Film> films = fs.SeFDate(c.connect(), date, date2);
        model.addAttribute("filmList", films);
        model.addAttribute("d1", date);
        model.addAttribute("d2", date2);
        return "films";
    }

    @RequestMapping(value = "/dirAnddate")
    public String DateandDir(Model model) throws SQLException, ClassNotFoundException {
        List<Director> dirs = fs.SeAD(c.connect());
        model.addAttribute("dirList", dirs);
        return "DateAndDirSerch";
    }

    @RequestMapping(value = "/filmbydiridanddate", method = RequestMethod.POST)
    public String getFilmDateandDir(@ModelAttribute("date1") String date, @ModelAttribute("date2") String date2,
                                    @ModelAttribute("id") Integer id, Model model) throws SQLException, ClassNotFoundException {
        List<Film> films = fs.SeFDirandDate(c.connect(), date, date2, id);
        Director dr = (Director) fs.SeD(c.connect(), id);
        model.addAttribute("filmList", films);
        model.addAttribute("dir", dr);
        model.addAttribute("d1", date);
        model.addAttribute("d2", date2);
        return "films";
    }
}