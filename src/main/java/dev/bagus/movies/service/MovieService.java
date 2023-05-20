package dev.bagus.movies.service;



import dev.bagus.movies.entity.Movie;
import dev.bagus.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String ImdbId){
        return movieRepository.findMOvieByImdbId(ImdbId);
    }
}
