public class Bear extends Animal{

    public Bear(String name,String favFood) {
        super(name,"fish");
    }

    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");
    }

}
