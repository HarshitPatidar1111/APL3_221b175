class WoodenDuck extends Duck implements Mute {
    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}