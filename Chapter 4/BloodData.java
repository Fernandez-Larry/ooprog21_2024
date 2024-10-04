public class BloodData {
    
    private String bloodType;
    private String rhFactor;

    
    public BloodData() {
        this.bloodType = "A"; 
        this.rhFactor = "-"; 
    }

    
    public BloodData(String bloodType, String rhFactor) {
        this.setBlood(bloodType);
        this.setRh(rhFactor);
    }

    
    public String getBlood() {
        return bloodType;
    }

   
    public void setBlood(String bloodType) {
        if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type. Setting default blood type to A.");
            this.bloodType = "A";
        }
    }
