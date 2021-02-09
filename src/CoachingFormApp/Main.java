package CoachingFormApp;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newName;
        String newPositionType;
        String newPositionArea;
        String newEmployeeNumber;
        //String placeholder;
        int x = 3;
        int y = x++;

        Employee employee1 = new Employee("Jeremy Gathing", new Position("Agent", "Home Theater"), "a308757");
        Employee employee2 = new Employee("Steve Jones", new Position("Double Agent", "Home Theater"),
                "a12394");
        Employee employee3 = new Employee("Elisha Lawrence", new Position("Double Agent", "Appliance " +
                "Repair"), "a645832");


        ArrayList<Employee> employees = new ArrayList<>();
//        String[] employeeNumbers = {"employee4", "employee5", "employee6", "employee7", "employee8"};
//
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("Follow steps to enter up to 5 new employees (or ENTER to finish");

//        for (int i = 0; i < 9; i++) {

//
//            System.out.println("Employee Name: ");
//            newName = input.nextLine();
//
//            if (!newName.equals("")) {
//
//                System.out.println("Position: ");
//                newPositionType = input.nextLine();
//                System.out.println("Area of Expertise: ");
//                newPositionArea = input.nextLine();
//                System.out.println("Employee Number: ");
//                newEmployeeNumber = input.nextLine();
//
//
//                //Employee employee4 =
//                employees.add(i, new Employee(newName, new Position(newPositionType,
//                        newPositionArea), newEmployeeNumber));
//            } else {
//                break;
//            }
//        }

        do {

            System.out.println("Employee Name: ");
            newName = input.nextLine();

            if (!newName.equals("")) {

                System.out.println("Position: ");
                newPositionType = input.nextLine();
                System.out.println("Area of Expertise: ");
                newPositionArea = input.nextLine();
                System.out.println("Employee Number: ");
                newEmployeeNumber = input.nextLine();


                int i = 0;
                employees.add(i, new Employee(newName, new Position(newPositionType,
                        newPositionArea), newEmployeeNumber));
                i++;
            }

        } while (!newName.equals(""));

            for (Employee employee : employees) {
                System.out.println(employee.toString(employee));
            }


        }
    }
