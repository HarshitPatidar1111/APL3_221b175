class RedHeadDuck extends Duck implements Quack, Swim {
    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }

    @Override
    public void swim() {
        System.out.println("RedHead Duck flies.");
    }
}