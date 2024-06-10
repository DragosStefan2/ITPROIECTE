package Teme;

import java.util.ArrayList;
import java.util.List;

public class Tema26_27 {
    /*-Create a generic class Box<T> that can store a single item of any type.
Implement methods to set and get the item from the box.
-Design a Movie class with attributes like title, genre, and a list of ratings.
Create a method that retrieve the average rating for any movie.*/
}
    class Movie {
    private String title;
    private String genre;
    private List<Integer> ratings;

    // Constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ratings = new ArrayList<>();
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Method to add a rating
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    // Method to calculate the average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }
}
    class Box<T> {
    private T item;

    // Method to set the item in the box
    public void setItem(T item) {
        this.item = item;
    }

    // Method to get the item from the box
    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Example usage of Box class with Movie
        Box<Movie> movieBox = new Box<>();
        Movie movie = new Movie("Inception", "Sci-Fi");
        movie.addRating(5);
        movie.addRating(4);
        movie.addRating(5);
        movieBox.setItem(movie);

        Movie retrievedMovie = movieBox.getItem();
        System.out.println("Movie: " + retrievedMovie.getTitle());
        System.out.println("Average Rating: " + retrievedMovie.getAverageRating());
    }
}
