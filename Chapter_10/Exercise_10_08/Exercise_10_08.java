
package Exercise_10_08;

/**
* (Financial: the Tax class) Programming Exercise 8.12 writes a program for      *
* computing taxes using arrays. Design a class named Tax to contain the          *
* following instance data fields:                                                *
*                                                                                *
* ■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—    *
* 	 married filing jointly or qualifying widow(er), 2—married filing separately, *
* 	 and 3—head of household. Use the public static constants SINGLE_FILER        *  
* 	 (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_                   *
* 	 SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.             *
* ■ int[][] brackets: Stores the tax brackets for each filing status.            *
* ■ double[] rates: Stores the tax rates for each bracket.                       *
* ■ double taxableIncome: Stores the taxable income.                             *
*                                                                                *
* Provide the getter and setter methods for each data field and the getTax()     *
* method that returns the tax. Also provide a no-arg constructor and the         *
* constructor Tax(filingStatus, brackets, rates, taxableIncome).                 *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that uses the Tax class to print the 2001 and 2009 tax tables for      *
* taxable income from $50,000 to $60,000 with intervals of $1,000 for all four   *
* statuses. The tax rates for the year 2009 were given in Table 3.2. The tax     *
* rates for 2001 are shown in Table 10.1.                                 
 * @author DejanD
 */
public class Exercise_10_08 {
    public static void main(String[] args) {
        Tax tax2001 = new Tax();
        System.out.println("Taxes in year 2001, income 50.000$ to 60.000$\n");
        printHeader();
        for (int i = 50000; i <=60000; i +=1000){
            tax2001.setTaxableIncome(i);
            printRow(tax2001);
            System.out.println("");
        }
        
        //Year 2009
        int[][] brackets2009 = {
                        {8350, 33950, 82250, 171550, 372950},  // Single filer
			{16700, 67900, 137050, 208850, 372950}, // Married jointly													// -or qualifying widow(er)
			{8350, 33950, 68525, 104425, 186475},  // Married separately
			{11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double[] rates2009 = {10, 15, 25, 28, 33, 35};
        Tax tax2009 = new Tax(0,brackets2009,rates2009,0);
        System.out.println("\nTaxes in year 2009, income 50.000$ to 60.000$\n");
        printHeader();
        for (int i = 50000; i <=60000; i +=1000){
            tax2009.setTaxableIncome(i);
            printRow(tax2009);
            System.out.println("");
        }
    }
    public static void printRow(Tax tax){
        System.out.printf("%6.2f\t",tax.getTaxableIncome());
        for (int i = 0; i < tax.getBrackets().length; i++){
            tax.setFillingStatus(i);
            System.out.printf("%8.2f\t", tax.getTax());
        }
    }
    public static void printHeader(){
        System.out.println("TaxableIncome\tSingle Filler\tMarried—Filing\tMarried—Filing\tHead of Household");
        System.out.println("\t\t\t\tJointly\t\tSeparately");
        System.out.println("-------------------------------------------------------------------------");
    }
}
