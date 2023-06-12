package de.becoca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Testcontainers
public class CustomerRepoTest {

    @Container
    public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:14-alpine");

    @Autowired
    CustomerRepo customerRepo;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("Willibald");
        customer.setLastName("Wonnenich");
        Customer savedCustomer = customerRepo.save(customer);
        assertNotNull(savedCustomer.getId());
    }

}
