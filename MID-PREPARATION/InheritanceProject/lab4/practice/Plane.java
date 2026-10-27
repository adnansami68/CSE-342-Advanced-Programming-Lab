package lab4.practice;

public class Plane {
    private String planeName;
    private String licenseID;

    public Plane(){
        this.planeName = " ";
        this.licenseID = " ";
    }
    public Plane (String planeName , String licenseID){
        this.planeName = planeName;
        this.licenseID = licenseID;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public String getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }
    public void fly(){
        System.out.println(planeName + " is flying ....");
    }

}
