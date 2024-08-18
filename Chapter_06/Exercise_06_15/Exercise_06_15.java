
package Exercise_06_15;

/**
 * (Financial application: print a tax table) Listing 3.5 gives a program to compute
 * tax. Write a method for computing tax using the following header:
 * public static double computeTax(int status, double taxableIncome)
 * Use this method to write a program that prints a tax table for taxable income from
 * $50,000 to $60,000 with intervals of $50 for all the following statuses:
 *
 * Taxable  Single  Married Joint   Married     Head of
 * Income           or Qualifying   Separate    House Hold 
 *                  Widow(er)             
 * 50000    8688    6665            8688        7353
 * 50050    8700    6673            8700        7365
 * 50100    8712    6680            8712        7378
 * 50150    8725    6688            8725        7390
 * ......
 * 59850    11150   8142            11150       9815
 * 59900    11162   8150            11162       9828
 * 59950    11175   8158            11175       9840
 * 60000    11188   8165            11188       9853
 * Hint: round the tax into integers using Math.round (i.e., Math
 * .round(computeTax(status, taxableIncome))).
 * 
 * @author DejanD
 */
public class Exercise_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable\tSingle\tMarried Joint\tMarried\t\tHead of");
        System.out.println("Income\t\tor Qualifying\tSeparate\tHouse hold");
        System.out.println("\t\tWidow(er)");
        for (int i = 50000; i <=60000; i+=50){
            System.out.printf("%d\t%d\t%d\t\t%d\t\t%d\n", i, Math.round(computeTax(0,i)),
                    Math.round(computeTax(1,i)),
                    Math.round(computeTax(2,i)),
                    Math.round(computeTax(3,i)));
        }
    }
    public static double computeTax(int status, double taxableIncome){
        // Compute tax
        double tax = 0;
        double income = taxableIncome;

        switch (status) {
            case 0:
                // Compute tax for single filers
                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (income - 33950) * 0.25;
                } else if (income <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                } else if (income <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (income - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                }   break;
            case 1:
                // Compute tax for married file jointly or qualifying widow(er)
                if (income <= 16700) tax = income * 0.1;
                else if (income <=67900) tax = 16700*0.1 + (income - 16700) * 0.15;
                else if (income <= 137050) tax = 16700*0.1 + (67900 - 16700) * 0.15 + (income-67900)*0.25;
                else if (income <= 208250) tax = 16700*0.1 + (67900 - 16700) * 0.15 + (137050-67900)*0.25 + (income - 137050) * 0.28;
                else if (income <= 372950) tax = 16700*0.1 + (67900 - 16700) * 0.15 + (137050-67900)*0.25 + (208250 - 137050) * 0.28 + (income -208250)*0.33;
                else tax = 16700*0.1 + (67900 - 16700) * 0.15 + (137050-67900)*0.25 + (208250 - 137050) * 0.28 + (372950 -208250)*0.33 + (income - 372950) * 0.35;
                break;
            case 2:
                // Compute tax for married separately
                if (income <= 8350) tax = income * 0.1;
                else if (income <=33950) tax = 8350*0.1 + (income - 8350) * 0.15;
                else if (income <= 68525) tax = 8350*0.1 + (33950 - 8350) * 0.15 + (income-33950)*0.25;
                else if (income <= 104425) tax = 8350*0.1 + (33950 - 8350) * 0.15 + (68525-33950)*0.25 + (income - 68525) * 0.28;
                else if (income <= 186475) tax = 8350*0.1 + (33950 - 8350) * 0.15 + (68525-33950)*0.25 + (104425 - 68525) * 0.28 + (income - 104425)*0.33;
                else tax = 8350*0.1 + (33950 - 8350) * 0.15 + (68525-33950)*0.25 + (104425 - 68525) * 0.28 + (186475 - 104425)*0.33 + (income - 186475) * 0.35;
                break;
            case 3:
                // Compute tax for head of household
                if (income <= 11950) tax = income * 0.1;
                else if (income <=45500) tax = 11950*0.1 + (income - 11950) * 0.15;
                else if (income <= 117450) tax = 11950*0.1 + (45500 - 11950) * 0.15 + (income-45500)*0.25;
                else if (income <= 190200) tax = 11950*0.1 + (45500 - 11950) * 0.15 + (117450-45500)*0.25 + (income - 117450) * 0.28;
                else if (income <= 372950) tax = 11950*0.1 + (45500 - 11950) * 0.15 + (117450-45500)*0.25 + (190200 - 117450) * 0.28 + (income - 190200)*0.33;
                else tax = 11950*0.1 + (45500 - 11950) * 0.15 + (117450-45500)*0.25 + (190200 - 117450) * 0.28 + (372950 - 190200)*0.33 + (income - 372950) * 0.35;
                break;
            default:
                break;
        }
        return tax;
    }
}

