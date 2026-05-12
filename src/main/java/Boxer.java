import com.pluralsight.Fighter;

public class Boxer extends Fighter {

    public Boxer(String name, int strengthLevel) {
        super(name, strengthLevel);
    }

    public void powerPunch() {
        int damage = getStrengthLevel() * 2;
        System.out.println(getName() + " lands a massive power punch for " + damage + " damage!");
    }

    public void bobAndWeave() {
        System.out.println(getName() + " uses their footwork to dodge the attack.");
    }

}