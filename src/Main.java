//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.display();
        md.performQuack();
        md.performSwim();
        md.isFlying();
        RubberDuck rd = new RubberDuck();
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.isFlying();
        RedHeadDuck rh = new RedHeadDuck();
        rh.display();
        rh.performQuack();
        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.performQuack();

    }
}