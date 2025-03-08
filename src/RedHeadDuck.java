public class RedHeadDuck extends Duck {
    public void display() {
        System.out.println("RedHead Duck");
    }
    public RedHeadDuck() {
        quackBehavior = new Quack();
    }
}
