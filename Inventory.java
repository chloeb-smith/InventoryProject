import java.util.ArrayList;
import java.io.*;

public class Inventory {

    ArrayList<Apparel> apparelItems;

    Inventory(ArrayList<Apparel> apparelItems) {
        this.apparelItems = apparelItems;
    }

    public void addItem(Apparel item) {
        apparelItems.add(item);
        rewriteCSV(apparelItems);
    }

    public void deleteItem(int index) {
        apparelItems.remove(index - 1);
        rewriteCSV(apparelItems);
    }

    public String displayApparelItems() {
        String items = "";
        int index = 1; // Start index at 1

        for (Apparel item : apparelItems) {
            items = items + item.toString() + "[" + index + "]\n";
            index++;
        }

        return items;
    }

    public void rewriteCSV(ArrayList<Apparel> apparelItems) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("currentInventory.csv"))) {

            for (Apparel item : apparelItems) {
                writer.write(item.getProductName() + ',' + item.getDate() + ',' + item.getSize() + ',' + item.getCategory());
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("try again");
        }
    }
}
