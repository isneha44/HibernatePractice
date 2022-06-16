package util;

import entity.Coustomer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration= new Configuration() {
            public Object configure() {
            }

            @Override
            public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
                return new AppConfigurationEntry[0];
            }
        }.configure().addAnnotatedClass(Coustomer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderDetail.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)? factoryConfiguration=new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
