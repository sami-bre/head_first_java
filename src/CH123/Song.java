package CH123;

public class Song {
    public static void main(String[] args){
        String word = "bottles";
        for(int i=99; i>0; i--){
            if (i<2){
                word = "bottle";
            }
            System.out.println("There are " + i + " " + word +" of beer on the wall.");
            System.out.println(i + " " + word + " of beer.");
            System.out.println("take one out");
            System.out.println("pass it around");

            if(i==1){
                System.out.println("no more beers on the wall.");
            }
        }
    }
}
