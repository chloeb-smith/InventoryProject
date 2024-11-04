import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Apparel> apparelItems = new ArrayList<>();
        // create inventory object - storing apparel items
        Inventory inventory = new Inventory(apparelItems);

        Apparel gucciShirt = new Apparel("Gucci Shirt", "10/1/12", "L", "Top");
        Apparel basicShirt = new Apparel("Basic Shirt", "1/10/19", "M", "Top");
        Apparel watchShirt = new Apparel("Watch Shirt", "8/15/82", "S", "Top");

        //apparelItems.add(gucciShirt);
        //apparelItems.add(basicShirt);
        //apparelItems.add(watchShirt);

        inventory.addItem(gucciShirt);
        inventory.addItem(basicShirt);
        inventory.addItem(watchShirt);

        System.out.print(inventory.displayApparelItems());
    }
}
