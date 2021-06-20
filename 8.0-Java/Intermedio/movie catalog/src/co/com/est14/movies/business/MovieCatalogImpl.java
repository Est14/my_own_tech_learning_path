package co.com.est14.movies.business;

import co.com.est14.movies.data.DataAccessImpl;
import co.com.est14.movies.data.IDataAccess;
import co.com.est14.movies.domain.Movie;
import co.com.est14.movies.exceptions.*;

public class MovieCatalogImpl implements IMovieCatalog {

    private final IDataAccess data;

    public MovieCatalogImpl() {
        this.data = new DataAccessImpl();
    }


    @Override
    public void addMovie(String nameMovie) {
        Movie movie = new Movie(nameMovie);
        boolean add = false;
        try {
            add = data.exists(RESOURCE_NAME);
            data.write(movie, RESOURCE_NAME, add);
        } catch (DataAccessEX dataAccessEX) {
            System.out.println("Error to access data");
        }

    }

    @Override
    public void listMovieS() {
        try {
            var movies = data.list(RESOURCE_NAME);
            int count = 1;
            for (var movie:movies) {
                System.out.println("Movie #" + count + " " + movie);
                count++;
            }
        } catch (ReaderDataEx readerDataEx) {
            System.out.println("Error to list movies");
        }
    }

    @Override
    public void searchMovie(String search) {
        String result = "";
        try {
            result = data.search(RESOURCE_NAME, search );
        } catch (ReaderDataEx readerDataEx) {
            System.out.println("Error to search movie");
        }
        System.out.println(result);
    }

    @Override
    public void initFile() {
        try {
            if(data.exists(RESOURCE_NAME)){
                data.delete(RESOURCE_NAME);
            }
            data.create(RESOURCE_NAME);
        } catch (DataAccessEX dataAccessEX) {
            dataAccessEX.printStackTrace();
        }
    }
}
