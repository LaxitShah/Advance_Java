import java.util.Scanner;
public class NESTEDIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter Three Number");
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      if(n1>n2 && n1>n3)
      {
      System.out.println("The Biggest Number Among These is " + n1);
      }
      else if(n2>n1 && n2>n3)
      {
      System.out.println("The Biggest Number Among These is " + n2);
      }
      else
      {
      System.out.println("The Biggest Number Among These is " + n3);
      }
     }
}