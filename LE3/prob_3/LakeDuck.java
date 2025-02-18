class LakeDuck extends Duck implements Quack, Swim {
    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }

    @Override
    public void swim() {
        System.out.println("Lake Duck flies.");
    }
}