public class Jaeger {

    private String modelName;
    private String weapon;

    public Jaeger() {}

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

    public boolean isDrift() {
        System.out.println("Вы попали в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void attack() {
        System.out.println(modelName + " attack with weapon " + weapon);
    }
}