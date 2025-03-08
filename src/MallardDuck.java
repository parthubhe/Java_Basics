public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        swimBehavior =  new Swimming();
        flyBehavior = new Flying();

    }
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

}
