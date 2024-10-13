
package Exercise_09_02;

/**
 *
 * @author DejanD
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public Stock () {
        
    }
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    public void setpreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setcurrentPrice (double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double  getChangePercent() {
        return (currentPrice - previousClosingPrice) /
      previousClosingPrice * 100;
    }
    public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }
  
  public double getCurrentPrice() {
    return currentPrice;
  }
}
