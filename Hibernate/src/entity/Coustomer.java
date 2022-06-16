package entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coustomer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;



    @OneToMany(mappedBy = "Coustomer")
    private List<Order> orderList=new ArrayList<>();

    public Coustomer() {
    }

    public Coustomer(String id, String name, String address, double salary, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.orderList = orderList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Coustomer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", orderList=" + orderList +
                '}';
    }


}



