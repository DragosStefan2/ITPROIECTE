package Challenges;

public class Fruit {

    public void taste(){
        System.out.println("Fruit has a taste");
    }

}
    class Apple extends Fruit{
    @Override
    public void taste() {
        System.out.println("Apple is sweet.");
    }
}
    class Orange extends Fruit{
    @Override
    public void taste() {
        System.out.println("Orange is tangy.");
    }
}
