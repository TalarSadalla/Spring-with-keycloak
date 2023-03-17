package com.infybuzz.entity;

import javax.persistence.*;

@Table(name = "movies")
@Entity
public class Movies {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long Id;

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private String year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
