import java.util.ArrayList;

public class Inventory {

    ArrayList<Apparel> apparelItems;

    Inventory(ArrayList<Apparel> apparelItems){
        this.apparelItems = apparelItems;
    }

    public void addItem(Apparel item) {
        apparelItems.add(item);
    }

    public void deleteItem(int index){
        apparelItems.remove(index-1);
    }

    public String displayApparelItems(){
        String items = "";
        int index = 1; // Start index at 1

        for (Apparel item : apparelItems) {
            items = items + item.toString() + "[" + index + "]\n";
            index++;
        }

        return items;
    }
}
