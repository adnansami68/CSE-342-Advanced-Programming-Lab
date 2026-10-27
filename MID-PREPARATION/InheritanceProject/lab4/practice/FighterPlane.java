package lab4.practice;

public class FighterPlane extends Plane{
    private String weapon;

    public FighterPlane(){
        this.weapon = " ";
    }

    public FighterPlane(String planeName , String licenseID , String weapon){
        super(planeName , licenseID);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println("Fighter Plane attacking with "+ weapon);
    }
}
