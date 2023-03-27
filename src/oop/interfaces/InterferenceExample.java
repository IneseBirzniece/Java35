package oop.interfaces;

interface Bug{
    public void bugSound();
    public void bugSize();
}

class Ant implements Bug, location{
    public void bugSound(){
        System.out.println("tsss");
    }
    @Override
    public void bugSize() {
        System.out.println("Small");
    }
    public void location(){
        System.out.println("Forest");
    }
}

interface location{
    public void location();

}



public class InterferenceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();
    }
}
