abstract public class Duck {
    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    SwimBehavior swimBehavior;
    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
    public void performSwim(){
        swimBehavior.swim();
    }
    FlyBehavior flyBehavior;
    public void isFlying(){
        flyBehavior.fly();
    }

    abstract public void display();
}
