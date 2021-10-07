public class EmployeeWageCalculate {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_HALF_TIME = 4;
        int EMP_RATE_PER_HOUR = 20;

        int empHour = 0;
        int empWage = 0;
        double empCheck =Math.floor(Math.random() * 10 ) % 2;
        if ( empCheck == IS_FULL_TIME )
            empHour = 8;
        else if ( empCheck == IS_HALF_TIME );
            empHour = 4;
        empWage = empHour * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage" + empWage );
            
    }
}
// Employee Check Full time or Half time Working
