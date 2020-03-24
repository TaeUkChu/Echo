import java.util.Scanner;

Public class Echo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("This is Echo program. Please Speak out!");
    String speak = in.nextLine();
    
    System.out.println("%s /n", speak);
    }
 }
