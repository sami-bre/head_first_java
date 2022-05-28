/*
*  SOME ENCAPSULATION WON'T HURT :)
* */
package CH4;

public class Guitar {
    String brand;
    int numberOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String brandName){
        brand = brandName;
    }

    int getNumberOfPickups(){
        return numberOfPickups;
    }

    void setNumberOfPickups(int number){
        numberOfPickups = number;
    }

    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean tOrF){
        rockStarUsesIt = tOrF;
    }


}
