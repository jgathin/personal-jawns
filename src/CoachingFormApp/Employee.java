package CoachingFormApp;

public class Employee {

    private String name;
    private Position position;
    private String employeeNumber;

public Employee(String name){
        this.name = name;
}

public Employee(String name, Position position, String employeeNumber){
    this.name = name;
    this.position = position;
    this.employeeNumber = employeeNumber;
}

public String toString(Employee employee) {

    return "\n" +
            "Name: "+employee.getName() +"\n"+
            "Position: "+employee.position.typeToString()+"\n"+
            "Area of Expertise: "+employee.position.areaofExpertiseToString()+"\n"+
            "Employee Number: "+employee.getEmployeeNumber()+"\n";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
