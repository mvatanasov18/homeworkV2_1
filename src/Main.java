import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nType Menu:");
            System.out.println("1. Integer");
            System.out.println("2. Float");
            System.out.println("3. Double");
            System.out.println("4. Boolean");
            System.out.println("5. Byte");
            System.out.println("6. Short");
            System.out.println("7. Long");
            System.out.println("8. Auto-detect");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            Scanner scan = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(scan.nextLine());

                if (choice == 9) {
                    break;
                }


                while (true) {
                    System.out.println("\nOperation Menu:");
                    System.out.println("1. Multiplication");
                    System.out.println("2. Division");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice: ");
                    int option = 0;
                    try {
                        option = Integer.parseInt(scan.nextLine());


                    } catch (Exception e) {
                        System.out.println("\nInvalid number");
                    }
                    if (option == 3) {
                        break;
                    }

                    System.out.print("\nEnter the first number: ");
                    String numberA = scan.nextLine();
                    System.out.print("\nEnter the second number: ");
                    String numberB = scan.nextLine();
                    NumberCalculator nc = null;
                    try {
                        if (choice == 1) {
                            //int
                            nc = new NumberCalculator(Integer.MAX_VALUE, choice);

                            nc.setNumberA(Integer.parseInt(numberA));
                            nc.setNumberB(Integer.parseInt(numberB));


                        } else if (choice == 2) {
                            //float
                            nc = new NumberCalculator(Float.MAX_VALUE, choice);
                            nc.setNumberA(Float.parseFloat(numberA));
                            nc.setNumberB(Float.parseFloat(numberB));

                        } else if (choice == 3) {
                            //double
                            nc = new NumberCalculator(Double.MAX_VALUE, choice);
                            nc.setNumberA(Double.parseDouble(numberA));
                            nc.setNumberB(Double.parseDouble(numberB));


                        } else if (choice == 4) {
                            //boolean
                            nc = new NumberCalculator(1, choice);
                            nc.setNumberA(Integer.parseInt(numberA));
                            nc.setNumberB(Integer.parseInt(numberB));


                        } else if (choice == 5) {
                            //byte
                            nc = new NumberCalculator(Byte.MAX_VALUE, choice);
                            nc.setNumberA(Byte.parseByte(numberA));
                            nc.setNumberB(Byte.parseByte(numberB));


                        } else if (choice == 6) {
                            //short
                            nc = new NumberCalculator(Short.MAX_VALUE, choice);
                            nc.setNumberA(Short.parseShort(numberA));
                            nc.setNumberB(Short.parseShort(numberB));


                        } else if (choice == 7) {
                            //long
                            nc = new NumberCalculator(Long.MAX_VALUE, choice);
                            nc.setNumberA(Long.parseLong(numberA));
                            nc.setNumberB(Long.parseLong(numberB));


                        }
                        else if (choice == 8) {
                            //auto-detect
                            AutoDetect au=new AutoDetect();


                        }else{
                            System.out.println("\nInvalid number for menu №1");

                        }
                        if (option == 1) {
                            System.out.printf("\n%s * %s = ", numberA, numberB);
                            assert nc != null;
                            nc.multiplication();

                        }
                        else if (option == 2) {
                            System.out.printf("\n%s / %s = ", numberA, numberB);
                            assert nc != null;
                            nc.division();
                        }else{
                            System.out.println("\nInvalid number for menu №2");
                        }
                    } catch (Exception e) {
                        System.out.println("\nEnter a valid number!");
                    }

                }
            } catch (Exception e) {
                System.out.println("\nEnter a valid number");
            }

        }
    }
}