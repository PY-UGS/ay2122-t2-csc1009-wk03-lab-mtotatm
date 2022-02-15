package Week3;

public class Week3Q1
{
    public static void main(String[] args)
    {
        Loan newLoan = new Loan();
        newLoan.loan(2.5,5,1000);
        newLoan.getMonthlyPayment();
        newLoan.getTotalPayment();
    }
}
