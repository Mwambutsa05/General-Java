package CodingTasks3;

public class InvetoryManager {
    InventoryManager inventoryManager = new InventoryManager();
    Item item = inventoryManager.new Item(string:"Pen", int:10, int:2.5);
}

class Item{
    public String name;
    public int quantity;
    public double price;

    public item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

public void addStock(int amount){
        if  (amount > 0) {
            quantity += amount;
        }
}

public void removeStock(int amount){
        if (amount > 0) {
            quantity -= amount;
        }
}

public void getValue(){
        quantity *= price;
}

public void displayItem(){
    System.out.println("Item" + name + "Quantity" + quantity + "value" + price );
}

}

