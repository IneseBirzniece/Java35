package oop.inheritance;

class Parent{
    public void printParent(){
        System.out.println("This is parent class");
    }
}
//superclass

class Child extends Parent{
    public void printChild(){
        System.out.println("This is child class");
    }

}
//subclass

public class InheritanceIntro {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printChild();
        child.printParent();

    }
}
