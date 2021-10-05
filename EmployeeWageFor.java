public class EmployeeWageFor {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_HALF_TIME = 4;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static void main(String[] args) {


        int empHour = 0, empWage = 0, totalEmpWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
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
        empWage = empHour * EMP_RATE_PER_HOUR;
        totalEmpWage += empWage;
        System.out.println("Emp Wage" + empWage );
            
    }
    System.out.println("Total Emp Wage" + totalEmpWage );
}
}
