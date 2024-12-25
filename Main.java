public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); ---> error
        Cow wagyu = new Cow();
        Duck donald = new Duck("Donald");
        Duck daisy = new Duck("Daisy");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
//        wagyu.sound();
//        donald.sound();
//        burin.sound();
//        hedwig.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        Duck jiaTongHeng = new PekingDuck("JTH");
        jiaTongHeng.clean(daisy);
        jiaTongHeng.fly();

        donald.clean(new Cow()); // Cow no have reference (Anonymous object)
        donald.clean(new Cow());
        donald.clean(new Cow());

    }
}