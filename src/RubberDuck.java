public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Quack();
        swimBehavior = new Floating();
        flyBehavior = new NotFlying();
    }
    public void display() {
        System.out.println("Rubber Duck");
    }


}
