package CH123;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie " + this.title);
    }
}

class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "life";
        one.genre = "scifi";
        one.rating = 4;

        Movie two = new Movie();
        two.title = "far from home";
        two.genre = "superhero";
        two.rating = 3;

        one.playIt();
        two.playIt();
    }
}
