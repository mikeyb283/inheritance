/**
 * The Commercial class allow differentiation between customer types
 */
public class Commercial extends Customer {
  private String  property;
  private boolean multiProperty;

  /**
   * The Commercial constructor
   * @param propertyName takes the property's name
   * @param customerAddress takes the customer's address
   * @param customerPhone takes the customer's phone number
   * @param squareFootage take the property's square footage
   * @param multiProperty takes yes or no
   */
  Commercial(String propertyName, String customerAddress, String customerPhone, double squareFootage, boolean multiProperty){
    super(propertyName, customerAddress, customerPhone, squareFootage);
    setProperty(property);
    setMultiProperty(multiProperty);
  }

  public String getProperty() {
    return property;
  }

  private void setProperty(String property) {
    this.property = property;
  }

  public boolean isMultiProperty() {
    return multiProperty;
  }

  private void setMultiProperty(boolean multiProperty) {
    this.multiProperty = multiProperty;
  }

  /**
   * Method: weeklyCharges
   * Use: to calculate the weekly charges for the customer
   */
  public void weeklyCharges() {
    double charge;
    double RATE = 5.00;
    int PERSQUARE = 1000;
    if(multiProperty) {
      double DISCOUNT = 0.90;
      charge = (super.getSquareFootage()/ PERSQUARE) * RATE * DISCOUNT;
    }
    else {
      charge = (super.getSquareFootage()/ PERSQUARE) * RATE;
    }
    super.printQuote(charge);

  }
}
