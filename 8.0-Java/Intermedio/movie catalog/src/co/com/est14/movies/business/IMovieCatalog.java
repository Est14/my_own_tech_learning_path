package co.com.est14.movies.business;

public interface IMovieCatalog {
    String RESOURCE_NAME = "movies.txt";
    void addMovie(String nameMovie);
    void listMovieS();
    void searchMovie(String search);
    void initFile();

}
