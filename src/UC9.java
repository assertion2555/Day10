public class UC9 {
    
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME =2;
        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int totalEmpWage;
        public UC9 (String company, int empRatePerHour,
                     int numOfWorkingDays, int maxHoursPerMonth) {

            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
        }

    public UC9() {
        company = null;
        empRatePerHour = 0;
        maxHoursPerMonth = 0;
        numOfWorkingDays = 0;
    }

    public void computeEmpWage() {

            //variables
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            // computation

            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {

                    case IS_FULL_TIME:

                        empHrs = 8;
                        break;

                    case IS_PART_TIME:
                        empHrs = 4;
                        break;

                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);

            }

            totalEmpWage = totalEmpHrs * empRatePerHour;
        }
        public String toString() {
            return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;

        }

        public static void main(String[] args){

            UC9 dMart = new UC9("DMart", 20, 2, 10);
            UC9 reliance = new UC9 ("Reliance", 10, 4, 20);
            dMart.computeEmpWage();
            System.out.println(dMart);
            reliance.computeEmpWage();
            System.out.println(reliance);

        }


    }
