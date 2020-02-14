package testZ.cinema.domain;

import java.util.Objects;

public class Film {
    String name;
    String date;
    String genre;

    public Film() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Objects.equals(name, film.name) &&
                Objects.equals(date, film.date) &&
                Objects.equals(genre, film.genre);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", genre='" + genre + '\'' + '\n'

                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, genre);
    }

}
