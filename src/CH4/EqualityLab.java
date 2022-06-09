/*
*   the == operator ALWAYS compares the bit patterns of in variables
*   the Object.equals(...) method can be used to tell if two objects
*   equal each other. this kind of equality depends on the objects, I think.
* */
package CH4;

class Phone{
    String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class EqualityLab {

    public static void main(String args[]){
        int x = 18;
        int y = 18;
        if(x == y){
            System.out.println("x == y is true!");
        }

        Phone myPhone = new Phone();
        Phone yabsesPhone = new Phone();
        Phone mine = myPhone;
        if(myPhone == yabsesPhone){
            System.out.println("this is wierd, check it out");
        }
        if (mine.equals(myPhone)){
            System.out.println("This should be printed");
        }


    }
}
