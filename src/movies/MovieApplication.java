package movies;


import util.Input;

public class MovieApplication {
public static Movie[] movies = MoviesArray.findAll();

    public static Movie getAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());

        }
    }
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");

        Input userInput = new Input();

        int getInt = userInput.getInt();
        System.out.println(getInt);

        if (getInt == 0) {
            System.out.println("Thank you for coming");
        }else if(getInt == 1){
            System.out.println("Here are all the Movies in our data base: \n" + getAllMovies());
        }

    }
}
