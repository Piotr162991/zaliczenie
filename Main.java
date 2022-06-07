import java.util.Scanner;



class Main {
   public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Podaj łańcuch do sprawdzenia");
    String lan = scan.nextLine();
    int dl = lan.length();
     System.out.println(dl);
  }
}