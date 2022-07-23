import java.util.InputMismatchException;

public class Console {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***              Welcome and Hi                ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
    }


    public static int getNumber(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\"" + scanner.next() + "\" is not a number dumdum. Please enter a number.");
            }
        }
    }


    public static void MM(){
        int choice = getNumber("1) Add new product\n2) Get by ID\n3) Add existing to inventory\n" +
                "4) Remove existing from inventory\n5) Delete Product\n6) Get inventory\n7) Exit");
    }


}
