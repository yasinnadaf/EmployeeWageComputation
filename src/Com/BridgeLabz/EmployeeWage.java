package Com.BridgeLabz;

public class EmployeeWage {

    static final int EMOPLOYEE_PRESENT=1;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int attendence= (int) (Math.floor(Math.random()*10))%2;

        if(attendence==EMOPLOYEE_PRESENT) {
            System.out.println("Employee is present");
        }

        else {
            System.out.println("Employee is absent");
        }


    }
}
