package co.com.est14.movies.data;

import co.com.est14.movies.domain.Movie;
import co.com.est14.movies.exceptions.*;


import java.io.*;
import java.util.*;


public class DataAccessImpl implements IDataAccess {

    @Override
    public boolean exists(String resourceName) {
        var file = new File(resourceName);
        return file.exists();
    }

    @Override
    public List<Movie> list(String resourceName) throws ReaderDataEx {
        var file = new File(resourceName);
        List<Movie> movies = new ArrayList<Movie>();
        try {
            var input = new BufferedReader(new FileReader(file));
            String line = null;
            line = input.readLine();
            while (line != null){
                var movie = new Movie(line);
                movies.add(movie);
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReaderDataEx("Error try to read file " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReaderDataEx("Error try to read file " + e.getMessage());
        }
        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean add) throws WriterDataEX {
        var file = new File(resourceName);
        try {
            var out = new PrintWriter(new FileWriter(file, add));
            out.println(movie.toString());
            out.close();
            System.out.println("Movie: " + movie.toString() + " was add successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new WriterDataEX("Error try to access file " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new WriterDataEX("Error try to write file " + e.getMessage());
        }
    }

    @Override
    public String search(String resourceName, String search) throws ReaderDataEx {

        var file = new File(resourceName);
        String result = "";
        try {
            var input = new BufferedReader(new FileReader(file));
            var reader = input.readLine();
            int counter = 1;
            while (reader != null){
                if (search != null && search.equalsIgnoreCase(reader)){
                    result = "The movie " + reader + "is in the list, in the line #" + counter;
                    break;
                }
                reader = input.readLine();
                counter++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReaderDataEx("Error to try read file " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReaderDataEx("Error to try read file " + e.getMessage());
        }

        return result;
    }

    @Override
    public void create(String resourceName) throws DataAccessEX {
        var file = new File(resourceName);
        try {
            var out = new PrintWriter(new FileWriter(file));
            out.close();
            System.out.println("File was created");
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReaderDataEx("Error to try create file" + e.getMessage());
        }
    }

    @Override
    public void delete(String resourceName)  {
        var file = new File(resourceName);
        if (file.exists()){
            file.delete();
        }
        System.out.println(resourceName + " was deleted");
    }
}
