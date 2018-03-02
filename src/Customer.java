/**
 * The Customer class declaration
 */
class Customer {
  private String customerName;
  private String customerPhone;
  private String customerAddress;
  private double squareFootage;

  /**
   * Customer constructor
   * @param customerName takes the customer name
   * @param customerAddress takes the customer address
   * @param customerPhone takes the customer phone number
   * @param squareFootage takes teh property' size
   */
  Customer(String customerName, String customerAddress, String customerPhone, double squareFootage) {
    setCustomerName(customerName);
    setCustomerAddress(customerAddress);
    setCustomerPhone(customerPhone);
    setSquareFootage(squareFootage);
  }

  /**
   * Method: printQuote
   * Use: formats and displays the customer's information and account charges
   * @param totalCharge passes in from the weeklyCharges method
   */
  void printQuote(double totalCharge) {
    System.out.println("\nYOUR QUOTE");
    System.out.println(getCustomerName());
    System.out.println(getCustomerAddress());
    System.out.println(String.format("(%s) %s-%s", getCustomerPhone().substring(0, 3), getCustomerPhone().substring(3, 6),
        getCustomerPhone().substring(6, 10)));
    System.out.println("Weekly Cost: " + (java.text.NumberFormat.getCurrencyInstance().format(totalCharge)));
  }

  private String getCustomerName() {
    return customerName;
  }

  private void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  private String getCustomerPhone() {
    return customerPhone;
  }

  private void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  private String getCustomerAddress() {
    return customerAddress;
  }

  private void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  double getSquareFootage() {
    return squareFootage;
  }

  private void setSquareFootage(double squareFootage) {
    this.squareFootage = squareFootage;
  }

}
