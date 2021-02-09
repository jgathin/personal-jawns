package CoachingFormApp;

public class Position {
    String type;
    String areaOfExpertise;

    public Position(String type, String areaOfExpertise){
        this.type = type;
        this.areaOfExpertise = areaOfExpertise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }


    public String typeToString() {
        return type;
    }


    public String areaofExpertiseToString() {
        return areaOfExpertise;
    }
}
