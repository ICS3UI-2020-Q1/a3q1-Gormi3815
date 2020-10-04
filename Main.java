import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter three integers on seperate lines");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    if(number1 >= number2 && number1 >= number3){
      System.out.println("Maximum: " + number1);
    }
    else if(number2 >= number1 && number2 >=number3){
      System.out.println("Maximum" + number2);
    }
    else if(number3 >= number1 && number3 >= number2){
      System.out.println("Maximum" + number3);
    }
  }
}
