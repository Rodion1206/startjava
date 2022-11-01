public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setWeapon("incinerator turbines");
        Jaeger jaegerTwo = new Jaeger("Apex", "energy beam");
        jaegerOne.attack();
        jaegerTwo.attack();
        jaegerTwo.setWeapon("Z-14 Tesla fists");
        jaegerTwo.move();
        jaegerTwo.attack();
        System.out.println(jaegerOne.scanKaiju());
    }
}