public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.squeak();
        rubberDuck.mute();

        woodenDuck.swim();
        woodenDuck.mute();

        redHeadDuck.swim();
        redHeadDuck.quack();
        redHeadDuck.swim();

        lakeDuck.swim();
        lakeDuck.quack();
        lakeDuck.swim();
    }
}