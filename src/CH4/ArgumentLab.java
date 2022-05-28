package CH4;

class Student{
    String name;
    boolean happy;
    int age;

    Student(boolean happy){
        this.happy = happy;
    }
}

class Registrar{
    void makeUnhappy(Student student){
        student.happy = false;
        student.age += 10;
    }

    static void changeNum(double number){
        number = Math.random();
        System.out.println("in the method: " + number);
    }
}

class Driver{
    public static void main(String args[]){
//        CH4.Student stu = new CH4.Student(true);
//        CH4.Registrar reg = new CH4.Registrar();
//        System.out.println(stu.age);
//        reg.makeUnhappy(stu);
//        System.out.println(stu.age);

        float k = 0.3342f;
        System.out.println("before method call: " + k);
        Registrar.changeNum(k);
        System.out.println("after method call" + k);
    }


}