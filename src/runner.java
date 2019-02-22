public class runner {

    public static void main(String[] args){
    Tiger tigger = new Tiger("Tigger","bacon");
    Bear pooh = new Bear("Pooh","fish");

    Unicorn rarity = new Unicorn("Rarity", "marshmallows");

    Giraffe gemma = new Giraffe("Gemma","leaves");

    Bee stinger = new Bee("Stinger", "pollen");

        Animal[] animals = {tigger,pooh,rarity,gemma,stinger};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals("pollen", animals);

    }
}
