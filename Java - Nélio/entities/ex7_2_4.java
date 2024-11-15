package entities;

// Product

public class ex7_2_4 extends ex7_2_2 {

    private String name;
    private Double price;

    public ex7_2_4() {

    }

    public ex7_2_4(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
