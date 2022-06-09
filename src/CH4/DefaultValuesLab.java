/*
*   INSTANCE VARIABLES HAVE DEFAULT VALUES BEFORE INITIALIZATION
*   NUMERIC PRIMITIVES INCLUDING CHAR ARE ASSIGNED 0, BOOLEAN FALSE,
*   AND ABJECT REFERENCES ARE ASSIGNED NULL.
* */
package CH4;

class Computer{
    private int size;
    private String name;
    private Human owner;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}

class Human{}

public class DefaultValuesLab {
    public static void main(String args[]){
        Computer pc = new Computer();
        // we're getting INSTANCE VARIABLES before initialization. so we get their default values
        System.out.println("Instance variables have default values ...");
        System.out.println("size: " + pc.getSize());
        System.out.println("name: " + pc.getName());
        System.out.println("owner: " + pc.getOwner());

        System.out.println("But local variables can't be used at all before initialization.");

        // but LOCAL VARIABLES, we can't use them at all before initialization.
        // the following code won't compile

//        int number_of_computers;
//        System.out.println(number_of_computers);
    }
}
