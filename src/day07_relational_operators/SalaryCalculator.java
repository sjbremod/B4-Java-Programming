package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double basesalary = 100_000.00;
        double stateTaxRate = 0.08;
        double federTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;

        stateTaxAmount = basesalary * stateTaxRate;
        federalTaxAmount = basesalary * federTaxRate;
        totalTaxAmount = stateTaxAmount + federalTaxAmount;
        salaryAfterTax =  basesalary - totalTaxAmount;

        String taxReport = "Tax Info: \n\tBase Salary: $" +basesalary + "\n\tState Tax Rate: " + stateTaxRate + "\n\tFederal Tax Rate: " + federTaxRate + "\n\t----------\n\tAfter Tax: \t\t$ " + salaryAfterTax;
        System.out.println(taxReport);


    }
}
