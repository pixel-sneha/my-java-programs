public class LoanCalculator {
    public double calculateEMI(int principal, int time, float rate) {
        double annualRatePercent = rate;
        return computeEmi(principal, time, annualRatePercent);
    }
    public double calculateEMI(double principal, int time, double rate) {
        double annualRatePercent = rate;
        return computeEmi(principal, time, annualRatePercent);
    }

    public double calculateEMI(int principal, int time) {
        double fixedAnnualRate = 10.0;
        return computeEmi(principal, time, fixedAnnualRate);
    }

    private double computeEmi(double principal, int timeInYears, double annualRatePercent) {
        int n = timeInYears * 12; 
        double monthlyRate = (annualRatePercent / 100.0) / 12.0;
        if (monthlyRate == 0) {
            return roundToTwoDecimals(principal / n);
        }

        double factor = Math.pow(1 + monthlyRate, n);
        double emi = principal * monthlyRate * factor / (factor - 1);
        return roundToTwoDecimals(emi);
    }

    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        LoanCalculator calc = new LoanCalculator();
        int homePrincipal = 5000000;
        int homeTimeYears = 20;
        float homeAnnualRate = 7.5f;
        double homeEmi = calc.calculateEMI(homePrincipal, homeTimeYears, homeAnnualRate);
        System.out.println("Home Loan");
        System.out.println("Principal: Rs " + homePrincipal);
        System.out.println("Tenure: " + homeTimeYears + " years");
        System.out.println("Annual Rate: " + homeAnnualRate + "%");
        System.out.println("Monthly EMI: Rs " + String.format("%.2f", homeEmi));
        System.out.println();

        double vehiclePrincipal = 850000.0; 
        int vehicleTimeYears = 5;
        double vehicleAnnualRate = 9.0; 
        double vehicleEmi = calc.calculateEMI(vehiclePrincipal, vehicleTimeYears, vehicleAnnualRate);
        System.out.println("Vehicle Loan");
        System.out.println("Principal: Rs " + (long)vehiclePrincipal);
        System.out.println("Tenure: " + vehicleTimeYears + " years");
        System.out.println("Annual Rate: " + vehicleAnnualRate + "%");
        System.out.println("Monthly EMI: Rs " + String.format("%.2f", vehicleEmi));
        System.out.println();

        // Short-term personal loan
        int personalPrincipal = 150000;
        int personalTimeYears = 2;
        double personalEmi = calc.calculateEMI(personalPrincipal, personalTimeYears);
        System.out.println("Personal Loan (Short-term)");
        System.out.println("Principal: Rs " + personalPrincipal);
        System.out.println("Tenure: " + personalTimeYears + " years");
        System.out.println("Annual Rate: 10.0%");
        System.out.println("Monthly EMI: Rs " + String.format("%.2f", personalEmi));
    }
}