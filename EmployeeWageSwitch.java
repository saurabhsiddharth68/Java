public class EmployeeWageSwitch {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_HALF_TIME = 4;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {


        int empHour = 0;
        int empWage = 0;
        double empCheck =Math.floor(Math.random() * 10 ) % 2;
        switch ((int) empCheck ) {
            case IS_FULL_TIME:
                empHour = 8;
                break;

            case IS_HALF_TIME:
                empHour = 4;
                break; 
            default:
                empHour = 0;
        }
        empWage = empHour * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage" + empWage );
            
    }
}
