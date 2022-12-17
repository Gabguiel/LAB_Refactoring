package pt.up.fe.ldts.example1;

public class OrderLine {
    public Product product;
    public int quantity;

    public double getTotal(){
        double total=product.getPrice()*quantity;
        return total;
    }

    public String LineString(){
        return product.getName() + "(x" + quantity + "): " + (product.getPrice() * quantity) + "\n";

    }
    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
