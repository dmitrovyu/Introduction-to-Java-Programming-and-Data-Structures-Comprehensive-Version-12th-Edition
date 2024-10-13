
package Exercise_10_08;

/**
 ,-----------------------------------------------------.
|Tax                                                  |
|-----------------------------------------------------|
|-fillingStatus : int                                 |
|+{static} SINGLE_FILER: int                          |
|+{static}MARRIED_JOINTLY_OR_QUALIFYING_WIDOW-ER: int |
|+{static}MARRIED_SEPARATELY: int                     |
|+{static}HEAD_OF_HOUSEHOLD: int                      |
|-breckets : int[][]                                  |
|-rates : double[]                                    |
|-taxableIncome : double                              |
|+Tax()                                               |
|+Tax(filingStatus: int, brackets: int[][],           |
|rates: double[], taxableIncome: double)              |
|+getFillingStatus() : int                            |
|+setFillingStatus(status : int)                      |
|+getBrackets() : int[][]                             |
|+setBarckets(brackets : int[][])                     |
|+getRates() : double[]                               |
|+setRates(rates : double[][])                        |
|+getTaxableIncome() : double                         |
|+setTaxableIncoime(taxableIncome : double)           |
|+getTax()                                            |
`-----------------------------------------------------'
* UML done by https://www.plantuml.com/
 * @author DejanD
 */
public class Tax {
    private int fillingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    
    //Default Tax brackets and rates are from year 2001
    public Tax() {
        this.fillingStatus = Tax.SINGLE_FILER;
        this.rates = new double[]{15, 27.5, 30.5, 35.5, 39.1};
        this.brackets = new int[][] {
            {27050, 65550, 136750, 297350},
            {45200, 109250, 166500, 297350},
            {22600, 54625, 83250, 148675},
            {36250, 93650, 151650, 297350}  
        };
        this.taxableIncome = 0;
        
    }
    public Tax(int fillingStatus, int[][]brackets, double[]rates, double taxableIncome){
        this.fillingStatus = fillingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    
    //Get tax
    public double getTax(){
        int status = 0;
        for (int i = 0; i < brackets[fillingStatus].length; i++)
            if (taxableIncome > brackets[fillingStatus][i]) status = i + 1;
        return rates[status]/100 * taxableIncome;
        
    }
}
