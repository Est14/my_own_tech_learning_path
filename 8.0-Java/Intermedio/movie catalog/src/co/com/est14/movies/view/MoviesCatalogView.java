package co.com.est14.movies.view;

import co.com.est14.movies.business.IMovieCatalog;
import co.com.est14.movies.business.MovieCatalogImpl;

import java.util.Scanner;

public class MoviesCatalogView {
    public static void main(String[] args) {
        var option = -1;
        var scan = new Scanner(System.in);
        IMovieCatalog catalog = new MovieCatalogImpl();

        while(option != 0){
            System.out.println("Choose an option: \n" +
                    "1. Start movie catalog\n" +
                    "2. Add movie\n" +
                    "3. List movies\n" +
                    "4. Search movie \n" +
                    "0. exit");
            option = Integer.parseInt(scan.nextLine());

            switch(option){
                case 1:
                    catalog.initFile();
                    break;
                case 2:
                    System.out.println("Write movie name: ");
                    var name = scan.nextLine();
                    catalog.addMovie(name);
                    break;
                case 3:
                    catalog.listMovieS();
                    break;
                case 4:
                    System.out.println("Write a movie to search: ");
                    var name2 = scan.nextLine();
                    catalog.searchMovie(name2);
                    break;
                case 0:
                    System.out.println("See you soon!!!");
                    break;
                default:
                    System.out.println("It's not a valid option");
            }
        }
    }
}
