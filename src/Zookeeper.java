public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(String food, Animal[]animals){

            System.out.println(this.name + " is feeding " + food + " to " + animals.length + " animals out of " +
            Animal.population + " total animals.");

            for (int i = 0; i < animals.length;i++){
                animals[i].eat(food);
            }

    }
}
