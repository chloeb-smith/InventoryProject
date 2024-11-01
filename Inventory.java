import java.util.ArrayList;

public class Inventory {

    ArrayList<Apparel> apparelItems;

    Inventory(ArrayList<Apparel> apparelItems){
        this.apparelItems = apparelItems;
    }

    public void addItem(Apparel item) {
        apparelItems.add(item);
    }

    public void deleteItem(Apparel item){
        apparelItems.remove(item);
    }

    public String displayApparelItems(){
        String items = "";

        for (Apparel item : apparelItems) {
            items = items + item.toString() + "\n";
        }

        return items;
    }
}
