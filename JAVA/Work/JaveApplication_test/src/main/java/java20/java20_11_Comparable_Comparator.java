package java20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Movie implements Comparable<Movie> {

    private String name;
    private double rating;
    private int year;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]" + "\n";
    }

    public Movie() {
        super();
    }

    public Movie(String name, double rating, int year) {
        super();
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        // year에대해 정렬
        // + 일때
        // 0 일때
        // - 일때
        return this.year - o.year;
    }

    // rating을 기준으로 정렬
    public static class RatingCompare implements Comparator<Movie> {
        int mode = 1;

        public RatingCompare() {
            super();
            mode = 1;
        }

        public RatingCompare(boolean desc) {
            super();
            if (desc == true) {
                mode = -1;
            }
        }

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName()) * mode;

        }

    }

    // name을 기준으로 정렬
    public static class NameCompare implements Comparator<Movie> {

        @Override
        public int compare(Movie o1, Movie o2) {
            //
            // + 일때 : 바꾼다.
            // 0 일때 : 바꾸지 않는다.
            // - 일때 : 바꾸지 않는다.
            return o1.getName().compareTo(o2.getName());

        }

    }

}

public class java20_11_Comparable_Comparator {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force", 8.3, 2015));
        list.add(new Movie("Start", 8.7, 1977));
        list.add(new Movie("Empir", 8.8, 1990));
        list.add(new Movie("Retur", 8.4, 2000));

        // year를 기준으로 정렬
        Collections.sort(list);
        System.out.println(list.toString());

        // rating를 기준으로 정렬
        // 1. Movie.RatingCompare인스턴스 만들기
        // 2. Collections.sort()실행
        // 3. print
        Movie.RatingCompare rating = new Movie.RatingCompare();
        Collections.sort(list, rating);
        System.out.println(list.toString());

        // name를 기준으로 정렬
        Movie.NameCompare name = new Movie.NameCompare();
        Collections.sort(list, name);
        System.out.println(list.toString());

    }
}
