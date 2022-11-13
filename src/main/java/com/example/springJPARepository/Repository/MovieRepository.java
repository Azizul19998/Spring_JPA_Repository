package com.example.springJPARepository.Repository;

import com.example.springJPARepository.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {

}
