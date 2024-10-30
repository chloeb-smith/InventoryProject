public class Main {
    public static void main(String[] args) {
        Apparel gucciShirt = new Apparel("Gucci Shirt", "10/1/12", "L", "Top");
        Apparel basicShirt = new Apparel("Basic Shirt", "1/10/19", "M", "Top");
        Apparel watchShirt = new Apparel("Watch Shirt", "8/15/82", "S", "Top");



        Inventory inventory = new Inventory();
        inventory.addItem(gucciShirt);
        inventory.addItem(basicShirt);
        inventory.addItem(watchShirt);

        inventory.displayApparelItems();
    }
}
