package Com.BridgeLabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int attendence= (int) (Math.floor(Math.random()*10))%2;

        if(attendence==1) {
            System.out.println("Employee is present");
        }

        else {
            System.out.println("Employee is absent");
        }


    }
}
