class Movie{
    String name;
    String genre;
    int rate;
    void playIt(){
        System.out.println("The movie is \"" +name+ "\" genre is \"" +genre+ "\" Rating is \"" +rate+ "\"");

    }
}
public class MovieTest {
    public static void main(String[] args) {
        Movie M1 = new Movie();
        M1.name = "Lotr";
        M1.genre = "Fantasy";
        M1.rate = 10;
        M1.playIt();
        //M1.playIt("Lotr","Fantasy", 10);

        //Movie M2 = new Movie();
        //M2.playIt("Harry Potter", "Fantasy", 10);


    }
}
