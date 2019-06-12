import java.util.Scanner;

class incometax{
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    System.out.print("Total income for the year: $");
    int income = kin.nextInt();
    
    if (income>0 && income<=9525){
      double tax = income*0.1;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>9525 && income<=38700){
      double e1 = income-9525;
      double tax = (e1*0.12)+952.50;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>38700 && income<=82500){
      double e2=income-38700;
      double tax=(e2*0.22)+4453.5;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>82500 && income<=157500){
      double e3=income-82500;
      double tax=(e3*0.24)+14089.5;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>157500 && income<=200000){
      double e4=income-157500;
      double tax=(e4*0.32)+32089.5;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>200000 && income<=500000){
      double e5=income-200000;
      double tax=(e5*0.34)+45689.5;
      System.out.println("Tax to be paid: $" + tax);
    }
    if (income>500000){
      double e6=income-500000;
      double tax=(e6*0.37)+150689.5;
      System.out.println("Tax to be paid: $" + tax);
    }
    
  }
}