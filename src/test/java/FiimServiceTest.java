
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import testZ.cinema.config.Connection;
import testZ.cinema.config.WebConfig;
import testZ.cinema.domain.Director;
import testZ.cinema.domain.Film;
import testZ.cinema.service.FilmService;
import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebConfig.class)
@WebAppConfiguration
public class FiimServiceTest {

    @Resource
    private FilmService fm;

    @Test
    public void testFindById() throws SQLException, ClassNotFoundException {
        Connection c = new Connection();
        Director dr = (Director) fm.SeD(c.connect(), 1);
        assertEquals("Quentin", dr.getFirst_name());
        assertEquals("Tarantino", dr.getLast_name());
        assertEquals("1963-03-27", dr.getBirth_date());
        return;
    }

    @Test
    public void testFindByDate() throws SQLException, ClassNotFoundException {
        Connection c = new Connection();
        List<Film> films = fm.SeFDate(c.connect(), "2019 01 01", "2020 01 01");
        assertEquals(1, films.size());
        Film film = films.get(0);
        assertEquals("Once Upon a Time in Hollywood", film.getName());
        return;
    }

    @Test
    public void testFindByDateandDirId() throws SQLException, ClassNotFoundException {
        Connection c = new Connection();
        List<Film> films = fm.SeFDirandDate(c.connect(), "1990 01 01", "2020 01 01",2);
        assertEquals(1, films.size());
        Film film = films.get(0);
        assertEquals("Titanic", film.getName());
        return;
    }

    @Test
    public void testFindDirId() throws SQLException, ClassNotFoundException {
        Connection c = new Connection();
        List<Film> films = fm.SeF(c.connect(), 2);
        assertEquals(1, films.size());
        Film film = films.get(0);
        assertEquals("Titanic", film.getName());
        return;
    }

}
