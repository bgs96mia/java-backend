package dev.bagus.movies.repository;

import dev.bagus.movies.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

   Optional<Movie> findMOvieByImdbId(String ImdbId);
}
