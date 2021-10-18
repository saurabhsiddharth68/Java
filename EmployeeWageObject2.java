public class EmployeeWageObject {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computerEmpWage() {
        // Variable

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= dMart.maxHoursPerMonth && totalWorkingDays < dMart.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }
    @Override
    public String toString () {
            return "Total Emp Wage for Company:" + company + "is:" +totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWageObject2 dMart = new EmployeeWageObject2 ("DMart", 20,2,10);
        EmployeeWageObject2 reliance = new EmployeeWageObject2 ("Reliance", 10,4,20);
        dMart.computerEmpWage();
        System.out.println(dMart);
        reliance.computerEmpWage();
        System.out.println(Reliance);
    }
}
