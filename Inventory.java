import java.util.ArrayList;

public class Inventory {

    ArrayList<Apparel> apparelItems;

    Inventory(ArrayList<Apparel> apparelItems){
        this.apparelItems = apparelItems;

    }
    public void addItem(Apparel item){apparelItems.add(item);}
    
}
