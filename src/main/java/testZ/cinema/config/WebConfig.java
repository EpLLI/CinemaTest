package testZ.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import testZ.cinema.service.FilmService;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "testZ.cinema")
public class WebConfig {

    @Bean
    ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public FilmService getFilmService() {
        return new FilmService();
    }
}
