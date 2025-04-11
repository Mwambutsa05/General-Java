package CodingTasks3;

public class Item {
        public String name;
        public int quantity;
        public double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void addStock(int amount){
            if  (amount > 0) {
                quantity += amount;
            }
        System.out.println(quantity);
        }

        public void removeStock(int amount){
            if (amount > 0) {
                quantity -= amount;
            }
            System.out.println(quantity);
        }

        public void getValue(){
            quantity *= price;
            System.out.println("The total quantity is:" + quantity);
        }


        public void displayItem(){
            System.out.println("Item: " + name + "Quantity: " + quantity + "value:  " + price );
        }
}
