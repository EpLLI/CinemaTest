package testZ.cinema.domain;

import java.util.Objects;

public class Director {
    Integer id;
    String first_name;
    String last_name;
    String birth_date;

    public Director() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return Objects.equals(id, director.id) &&
                Objects.equals(first_name, director.first_name) &&
                Objects.equals(last_name, director.last_name) &&
                Objects.equals(birth_date, director.birth_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, birth_date);
    }
}
