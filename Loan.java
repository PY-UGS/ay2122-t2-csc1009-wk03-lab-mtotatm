package Week3;
import java.util.Date;

public class Loan
{
    double annualInterestRate = 2.5;
    int numberOfYears = 1;
    double loanAmount = 1000;
    java.util.Date loanDate;

    public void loan()
    {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public void loan(double annualInterestRate,int numberOfYears,double loanAmount)
    {
        this.setAnnualInterestRate(annualInterestRate);
        System.out.println("Annual Interest Rate set: " + annualInterestRate);
        this.setNumberOfYears(numberOfYears);
        System.out.println("Number of Year set: " + numberOfYears);
        this.setLoanAmount(loanAmount);
        System.out.println("Loan Amount set: " + loanAmount);
        this.loanDate = new Date();
        System.out.println("Date set: " + this.loanDate);
    }

    public double getMonthlyPayment()
    {
        double topPart = this.loanAmount * (this.annualInterestRate*0.12);
        System.out.println("topPart is: " + topPart);
        double botPart = (1-(1/(Math.pow(1+(this.annualInterestRate*0.12),this.numberOfYears))));
        System.out.println("botPart is: " + botPart);
        double monthlyPayment = topPart/botPart;
        System.out.println("Monthly Payment is: " + monthlyPayment);
        return monthlyPayment;
    }

    public double getTotalPayment()
    {
        double totalPayment = this.getMonthlyPayment() * this.numberOfYears;
        System.out.println("Total Payment is: " + totalPayment);
        return totalPayment;
    }

    private void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    private void setNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }
    private void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public int getNumberOfYears()
    {
        return this.numberOfYears;
    }
    public double getLoanAmount()
    {
        return this.loanAmount;
    }
    public java.util.Date getLoanDate()
    {
        return this.loanDate;
    }
}
