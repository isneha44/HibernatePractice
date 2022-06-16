import entity.Coustomer;
import entity.Item;
import entity.Order;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppInitializer {
    public static void main(String[] args) {
        Coustomer c1 = new Coustomer();

        c1.setId("C001");
        c1.setName("Imalka");
        c1.setAddress("Kadawatha");
        c1.setSalary(50000);

        Coustomer c2 = new Coustomer();
        c2.setId("C001");
        c2.setName("Imalka");
        c2.setAddress("Colombo");
        c2.setSalary(50000);

        Item p1 = new Item();
        p1.setItemCode("I001");
        p1.setDescription("Malliban");
        p1.setQtyOnHand(50);
        p1.setPrice(75);

        Item p2 = new Item();
        p2.setItemCode("I001");
        p2.setDescription("Malliban");
        p2.setQtyOnHand(80);
        p2.setPrice(80);

        Item p3=new Item();
        p3.setItemCode("I003");
        p3.setDescription("Rice");
        p3.setQtyOnHand(80);
        p3.setPrice(105);

        Order O1 = new Order();
        O1.setOrderId("OID-001");
        O1.setCustomer(c1);

        Order O2 = new Order();
        O2.setOrderId("OID-002");
        O2.setCustomer(c1);

        c1.getOrderList().add(O1);
        c1.getOrderList().add(O2);


    }
}