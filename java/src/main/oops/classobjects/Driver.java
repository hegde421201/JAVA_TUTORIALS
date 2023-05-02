package src.main.oops.classobjects;

public class Driver {

    public static void main(String[] args) {

        CODemo5 coDemo5 = new CODemo5();

        //methodA is private....so we get compilation error
        //coDemo5.methodA();

        coDemo5.methodB();

        coDemo5.setA(67);
        System.out.println("a is "+coDemo5.getA());
    }
}
