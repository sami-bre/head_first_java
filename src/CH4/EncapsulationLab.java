/*
*   MAKE INSTANCE VARIABLES PRIVATE, MAKE SETTERS AND GETTERS PUBLIC. (A RULE OF THUMB)
* */
package CH4;

class Dog {
    private String name;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String theName) {
        // this setter method doesn't do any validation now. but it's there in case I change
        // my mind in the future and decide to validate. that way, I won;t break anyone's code!
        name = theName;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float theHeight){
        // doing some validation
        if(theHeight < 2){
            height = 2;
        } else if (theHeight > 14){
            height = 14;
        } else {
            height = theHeight;
        }
    }
}

public class EncapsulationLab {
    public static void main(String args[]){
        Dog puppy = new Dog();

        // this won't work
//        puppy.name = "pup";

        puppy.setName("pup");
        puppy.setHeight(1.34f);
        System.out.println("name: " + puppy.getName());
    }
}
