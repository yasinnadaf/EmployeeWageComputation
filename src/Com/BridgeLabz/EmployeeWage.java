package Com.BridgeLabz;

 public class EmployeeWage {

    static final int EMPLOYEE_PRESENT=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int dailyWage=0;
        int attendence= (int) (Math.floor(Math.random()*10))%2;

        if(attendence==EMPLOYEE_PRESENT) {
            System.out.println("Employee is present");
              dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
        }

        else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily wage: "+dailyWage);


    }
}
