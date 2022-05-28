/*
*   SPEAK LIKE THOSE FOLKS IN THE MARKETING DEPARTMENT :)
*   NOT REALLY OBJECT ORIENTED, BUT A FUN PROGRAM TO RUN.
* */
package CH123;

public class PhreseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot",
        "B-to_B", "win-win", "front-end", "web-based", "pervasive",
        "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value added",
        "oriented", "centric", "distributed", "clustered", "branded",
        "outside-the-box", "positioned", "networked", "focused", "leveraged",
        "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution",
        "architecture", "core competency", "strategy", "mindshare",
        "portal", "space", "vision", "paradigm", "mission"};

        // find how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate random numbers
        int numOne = (int) (Math.random()*oneLength);
        int numTwo = (int) (Math.random()*twoLength);
        int numThree = (int) (Math.random()*threeLength);

        // make the phrase and print it
        String phrase = "What we need is " + wordListOne[numOne] + " " + wordListTwo[numTwo] + " " + wordListThree[numThree];
        System.out.println(phrase);
    }
}
