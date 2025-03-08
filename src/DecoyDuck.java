public class DecoyDuck extends Duck {
    public DecoyDuck() {
    quackBehavior = new Quack();
}
public void display() {
        System.out.println("DecoyDuck");
}
}
