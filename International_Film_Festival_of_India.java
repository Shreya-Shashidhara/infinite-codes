import java.util.Scanner;
class Item_Type {
    private String item_Type;
    private double cost_Per_Day;
    private double deposit;
    public void setItem_Type(String item_Type) {
        this.item_Type = item_Type;
    }
    public void setCost_Per_Day(double cost_Per_Day) {
        this.cost_Per_Day = cost_Per_Day;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public String getItem_Type() {
        return item_Type;
    }
    public double getCost_Per_Day() {
        return cost_Per_Day;
    }
    public double getDeposit() {
        return deposit;
    }


    public void display(){
        System.out.println("Item type details");
        System.out.println("Name : "+item_Type);
        System.out.println("CostPerDay : "+cost_Per_Day);
        System.out.println("Deposit : "+deposit);
    }
}
public class International_Film_Festival_of_India{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String item=s.next();
        System.out.println("Enter the cost per day");
        double cost=s.nextDouble();
        System.out.println("Enter the deposit");
        double deposit=s.nextDouble();
        Item_Type i=new Item_Type();
        i.setItem_Type(item);
        i.setCost_Per_Day(cost);
        i.setDeposit(deposit);
        i.display();
        s.close();
    }
}



