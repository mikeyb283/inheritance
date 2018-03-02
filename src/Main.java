import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    int choice = 1;

    /*
      Creating a menu for the client interface
     */
    while (choice !=3) {
      System.out.println("WELCOME TO MIKE'S LAWN SERVICE");
      System.out.println("Please make a selection from the menu options");
      System.out.println("1) Commercial");
      System.out.println("2) Residential");
      System.out.println("3) Exit");

      choice = userIn.nextInt();

      switch (choice) {
        case 1:
          commercial();
          choice = 3;
          break;
        case 2:
          residential();
          choice = 3;
          break;
        case 3:
          System.out.println("Thanks for your business!");
          choice = 3;
          break;
        default:
          System.out.println("Error, please make a selection from the menu");
          break;
      }
    }
  }

  /**
   * Instantiating the commercial Customer object
   */
  private static void commercial() {
    boolean multiProperty;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Commercial Customer");
    System.out.println("Please enter property name: ");
    String name = scanner.nextLine();
    System.out.println("Please enter customer address: ");
    String address = scanner.nextLine();
    System.out.println("Please enter customer phone number: ");
    String phone = scanner.nextLine();
    System.out.println("Please enter property size: ");
    String foot = scanner.nextLine();
    Double squareFootage = Double.parseDouble(foot);
    System.out.println("Is this a multi-property account? ");
    String discount = scanner.nextLine();
    multiProperty = discount.equalsIgnoreCase("yes") || discount.equalsIgnoreCase("y");

    Commercial commercial = new Commercial(name, address, phone, squareFootage, multiProperty);
    if (multiProperty) {
      System.out.println("Multi-Property Discount Applied");
    }
    commercial.weeklyCharges();

  }

  /**
   * Instantiating the residential Customer object
   */
  private static void residential() {
    Scanner scanner = new Scanner(System.in);
    boolean senior;
    System.out.println("Residential Customer");
    System.out.println("Please enter customer name: ");
    String name = scanner.nextLine();
    System.out.println("Please enter customer address: ");
    String address = scanner.nextLine();
    System.out.println("Please enter customer phone number: ");
    String phone = scanner.nextLine();
    System.out.println("Please enter property size: ");
    String foot = scanner.nextLine();
    Double squareFootage = Double.parseDouble(foot);
    System.out.println("Are you eligible for a senior discount? ");
    String discount = scanner.nextLine();
    senior = discount.equalsIgnoreCase("yes") || discount.equalsIgnoreCase("y");

    Residential cust = new Residential(name, address, phone, squareFootage, senior);
    if(senior) {
      System.out.println("Senior Discount Applied");
    }
    cust.weeklyCharges();
 }
}
