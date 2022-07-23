package Com.BridgeLabz;

 public class EmployeeWage {

    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;

     private  String company;
     private int empRatePerHour;
     private  int maxHoursPerMonth;
     private  int numOfWorkingDays;

    public void calculateWage(String  company, int empRatePerHour, int maxHrsPerMonth, int numberOfWorkingDays){

        int empHrs;
        int totalHours=0;
        int day=0;
        int dailyWage=0;
        int totalWage=0;

        while((totalHours<maxHrsPerMonth) && (day<numberOfWorkingDays)) {
            int attendence = (int) (Math.floor(Math.random() * 10)) % 3;


            switch (attendence) {

                case IS_FULL_TIME:
                    empHrs=8;
                    break;

                case IS_PART_TIME:
                   empHrs=4;
                    break;

                default:
                    empHrs=0;
                    break;
            }
           totalHours=totalHours+empHrs;
            dailyWage=empRatePerHour*empHrs;
            totalWage=totalWage+dailyWage;
            day++;
            System.out.println("Day "+day+" Emp work hour"+empHrs+" wage is "+dailyWage );
        }
        System.out.println("Total work hours is : "+totalHours);
        System.out.println("Total work days are: " +day);
        //System.out.println("Total wage is: " +totalWage);
        System.out.println("Total Wage of company "+company+ " is "+ totalWage);


    }

     public static void main(String[] args) {
         EmployeeWage flipkart=new EmployeeWage();
         flipkart.calculateWage("Flipkart",20,100,20);
         EmployeeWage amazon=new EmployeeWage();
         amazon.calculateWage("Amazon",15,90,20);
    }
 }
