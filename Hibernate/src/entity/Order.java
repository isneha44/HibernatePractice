package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Orders")
public class Order implements Serializable {
    @Id
    private String orderId;

    private LocalDate date;

    @ManyToOne
    private Coustomer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails=new ArrayList<>();

    public Order() {
    }

    public Order(String orderId, LocalDate date,  Coustomer customer, List<OrderDetail> orderDetails) {
        this.orderId = orderId;
        this.date = date;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public  Coustomer getCustomer() {
        return customer;
    }

    public void setCustomer( Coustomer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}