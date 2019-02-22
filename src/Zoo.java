public class Zoo {

    public class Tiger {

        private String name;
        private String favFood;

        public Tiger(String name, String favFood) {
            this.name = name;
            this.favFood = favFood;
        }

        public void sleep(String name) {
            System.out.println(this.name + " sleeps for 8 hours");
        }

        public void eat(String food) {
            System.out.println(this.name + " eats " + food);
            if (food.equals(favFood)) {
                System.out.println("YUM! " + this.name + " wants more " + food);
            } else {

                sleep(this.name);
            }
        }
    }
}
