class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.name = "qwerty";
        wolf.weight = 20;
        wolf.age = 5;
        wolf.color = "white";

        System.out.println("Пол - " + wolf.gender);
        System.out.println("Кличка - " + wolf.name);
        System.out.println("Вес - " + wolf.weight);
        System.out.println("Возраст - " + wolf.age);
        System.out.println("Окрас - " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}