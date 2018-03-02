/**
 * The Residential class allow differentiation between customer types
 */
public class Residential extends Customer {
  private boolean senior;

  /**
   * The residential constructor
   * @param customerName takes the customer's name
   * @param customerAddress takes the customer's address
   * @param customerPhone takes the customer's phone number
   * @param squareFootage take the property's square footage
   * @param senior takes yes or no
   */
  Residential(String customerName, String customerAddress, String customerPhone, double squareFootage, boolean senior){
    super(customerName, customerAddress, customerPhone, squareFootage);
    setSenior(senior);
  }

  /**
   * Method: isSenior
   * Use: determines if the customer is eligible for the senior discount
   * @return true or false whether or not the customer is a senior citizen
   */
  public boolean isSenior() {
    return senior;
  }

  /**
   * Method: setSenior
   * Use: using input from the customer whether or not they are senior citizens
   * @param senior yes or no whether the customer is a senior citizen
   */
  private void setSenior(boolean senior) {
    this.senior = senior;
  }

  /**
   * Method: weeklyCharges
   * Use: to calculate the weekly charges for the customer
   */
  public void weeklyCharges() {
    double RATE = 6.00;
    int PERSQUARE = 1000;
    double charges = (super.getSquareFootage()/ PERSQUARE) * RATE;
    if(senior) {
      double DISCOUNT = 0.85;
      charges *= DISCOUNT;
    }
    super.printQuote(charges);
  }
}
