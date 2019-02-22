public class Animal {
    public String name;
    public String favFood;
    static int population = 0;


    public Animal(String name, String favFood) {
        this.name = name;
        this.favFood = favFood;
        population ++;

    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food.equals(favFood)) {
            System.out.println("YUM! " + this.name + " wants more " + food);
        } else {

            sleep();
        }
    }
}
