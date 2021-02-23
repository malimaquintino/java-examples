package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    // sobrescreve o toString da class object
    public String toString(){
        return this.name+", $ "+String.format("%.2f",this.price)+", "+this.quantity+" unit(s), Total: $ "+String.format("%.2f",this.totalValueInStock());
    }
}
