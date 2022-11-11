package com.startjava.lesson_2_3.animal;

class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setName("qwerty");
        wolf.setWeight(20);
        wolf.setAge(5);
        wolf.setColor("white");

        System.out.println("Пол - " + wolf.getGender());
        System.out.println("Кличка - " + wolf.getName());
        System.out.println("Вес - " + wolf.getWeight());
        System.out.println("Возраст - " + wolf.getAge());
        System.out.println("Окрас - " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}