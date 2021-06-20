package co.com.est14.movies.data;

import co.com.est14.movies.domain.Movie;
import co.com.est14.movies.exceptions.*;

import java.util.List;

public interface IDataAccess {

    boolean exists(String resourceName) throws DataAccessEX;
    List<Movie> list(String resourceName) throws ReaderDataEx;
    void write(Movie movie, String resourceName, boolean add) throws WriterDataEX;
    String search(String resourceName, String search) throws ReaderDataEx;
    void create(String resourceName) throws DataAccessEX;
    void delete(String resourceName) throws  DataAccessEX;
}
