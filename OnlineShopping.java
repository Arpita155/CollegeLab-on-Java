package CollegeLab.SecondClass;

class Item{
    String itemName;
    int quantity;
    int pricePerUnit;
    int totalPrice;

    Item(String itemName, int quantity, int pricePerUnit){
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int calculate(int quantity,int pricePerUnit){
        totalPrice = quantity*pricePerUnit;
        return totalPrice;
    }
}
public class OnlineShopping {

    public static void main(String[] args) {
        Item it = new Item("Garnier faceWash",5,150);

        System.out.println("Total price is : "+it.calculate(it.quantity,it.pricePerUnit));
    }
}


