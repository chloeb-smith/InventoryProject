public class Apparel {
    String productName;
    String date;
    String size;
    String category;

    Apparel(String productName, String date, String size, String category){
        this.productName = productName;
        this.date = date;
        this.size = size;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String getDate() {
        return date;
    }

    public String getSize() {
        return size;
    }

    public String getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
