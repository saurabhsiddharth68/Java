public class EmployeeWageMultiCompany {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computerEmpWage (String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        //Variable
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME :
                    empHrs = 8;
                    break;
                case IS_PART_TIME :
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage for Company:" + company + "is" + totalEmpWage);
        return totalEmpWage:
    }

    public static void main(String[] args) {
        computerEmpWage("DMart", 20, 2, 10);
        computerEmpWage("Reliance", 10, 4, 20);
    }
}
