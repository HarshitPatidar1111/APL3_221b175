class RubberDuck extends Duck implements Squeak, Mute {
    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }

    @Override
    public void mute() {
        System.out.println("Rubber Duck is mute.");
    }
}