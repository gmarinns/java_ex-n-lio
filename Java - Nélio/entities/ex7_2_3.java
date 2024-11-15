package entities;

// OrderItem

public class ex7_2_3 {

    private Integer quantity;
    private Double price;

    private ex7_2_4 product;

    public ex7_2_3() {

    }

    public ex7_2_3(Integer quantity, Double price, ex7_2_4 product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ex7_2_4 getProduct() {
        return product;
    }

    public void setProduct(ex7_2_4 product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}
