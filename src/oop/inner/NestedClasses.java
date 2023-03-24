package oop.inner;

class OuterClass{
    int num = 10;
    class InnesrClass{
        int num = 5;

    }
}




public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("Outer class value: " + outerClass.num);

        //to call inner class object
        OuterClass.InnesrClass innesrClass = outerClass.new InnesrClass();
        System.out.println("Inner class value: " + innesrClass.num);


    }
}
