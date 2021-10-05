public class EmployeeWageWhile {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_HALF_TIME = 4;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HOURS_IN_MONTH = 10;
    public static void main(String[] args) {


        int totalEmpHour = 0, totalEmpWage = 0, totalWorkingDays = 0;
        while ( totalEmpHour <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
            int empHour = 0;
            totalWorkingDays++;
            int empCheck =( int ) Math.floor(Math.random() * 10 ) % 3;
            switch ( empCheck ) {
                case IS_FULL_TIME:
                    empHour = 8;
                    break;

                case IS_HALF_TIME:
                    empHour = 4;
                    break; 
                default:
                    empHour = 0;
            }
            totalEmpHour += empHour;
            int empWage = empHour * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage" + empWage );
            
        }
        System.out.println("Total Emp Wage" + totalEmpWage );
    }
}
