public class Jaeger {

    String modelName;
    String weapon;

    public Jaeger(){

    }

    public Jaeger(String modelName, String weapon) {
        this.modelName = modelName;
        this.weapon = weapon;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    boolean drift() {
        System.out.println("Вы попали в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    void attack() {
        System.out.println(modelName + " attack with weapon " + weapon);
    }
}