package entities;

// Order

import entities.enums.ex7_2_5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ex7_2_1 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private ex7_2_5 orderStatus;
    
    private ex7_2_2 client;
    private List<ex7_2_3> orderItem = new ArrayList<ex7_2_3>();

    public ex7_2_1(Date date, ex7_2_5 status, ex7_2_2 client) {
        moment = new Date();
    }
    
    public ex7_2_1(Date moment, ex7_2_5 orderStatus, ex7_2_2 client, List<ex7_2_3> orderItem) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public ex7_2_5 getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(ex7_2_5 orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ex7_2_2 getClient() {
        return client;
    }

    public void setClient(ex7_2_2 client) {
        this.client = client;
    }
    
    public void addItem(ex7_2_3 item) {
        orderItem.add(item);
    }
    
    public void removeItem(ex7_2_3 item) {
        orderItem.remove(item);
    }
    
    public Double total(){
        Double sum = 0.0;
        for(ex7_2_3 item : orderItem){
            sum += item.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (ex7_2_3 item : orderItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
