import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // create list of apparel items to be passed into inventory
        ArrayList<Apparel> apparelItems = new ArrayList<>();
        // create inventory object - storing apparel items
        Inventory inventory = new Inventory(apparelItems);

        Scanner scanner = new Scanner(System.in);

        int input = 999;

        while(input!= 0) {
            // Main Menu
            System.out.println("Add Item to inventory[1]");
            System.out.println("Display Inventory[2]");
            System.out.println("Exit[0]");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter name of product: ");
                String productName = scanner.nextLine();

                System.out.println("Enter date product was purchased: ");
                String date = scanner.nextLine();

                System.out.println("Enter size of product - if no size put N/A: ");
                String size = scanner.nextLine();

                System.out.println("Enter category of product (Top, Pants, Shoe, Accessory): ");
                String category = scanner.nextLine();


                Apparel item = new Apparel(productName, date, size, category);
                inventory.addItem(item);
                break;
            }




        }



        Apparel gucciShirt = new Apparel("Gucci Shirt", "10/1/12", "L", "Top");
        Apparel basicShirt = new Apparel("Basic Shirt", "1/10/19", "M", "Top");
        Apparel watchShirt = new Apparel("Watch Shirt", "8/15/82", "S", "Top");

        inventory.addItem(gucciShirt);
        inventory.addItem(basicShirt);
        inventory.addItem(watchShirt);

        System.out.print(inventory.displayApparelItems());
    }
}
