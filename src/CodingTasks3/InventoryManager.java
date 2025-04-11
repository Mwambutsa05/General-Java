package CodingTasks3;

public class InventoryManager {
    public static void main(String[] args) {
    Item item1 = new Item( "laptop", 10, 999.9);
    item1.addStock(10);
    item1.removeStock(10);
    item1.getValue();
    item1.displayItem();
    }
}

