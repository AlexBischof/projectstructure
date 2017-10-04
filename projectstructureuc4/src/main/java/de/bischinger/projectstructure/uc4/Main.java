package de.bischinger.projectstructure.uc4;

import de.bischinger.projectstructure.boundary.IPersonResource;
import org.jboss.resteasy.client.ProxyFactory;

import static org.jboss.resteasy.plugins.providers.RegisterBuiltin.register;
import static org.jboss.resteasy.spi.ResteasyProviderFactory.getInstance;

/**
 * Created by bischofa on 04.10.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        register(getInstance());

        IPersonResource client = ProxyFactory.create(IPersonResource.class,
                "http://localhost:8080/projectstructure/api");
        client.celebrateBirthday(42L);
    }
}
