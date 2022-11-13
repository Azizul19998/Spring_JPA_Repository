package com.example.springJPARepository.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_db")
public class Movie {
    @Id
    String name;
    @Column(name="duration_of_movie")
    int time;

    double rating;

    public Movie() {
    }

    public Movie(String name, int time, double rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
