package entities;

public class ex5_4_1 {

    public double dollarPrice;
    public double dollarAmount;

    public double getAmountInReais(){
        return dollarPrice * dollarAmount * 6 / 100;
    }

    public double getAmountInReal(){
        return dollarAmount * dollarPrice + getAmountInReais();
    }
}
