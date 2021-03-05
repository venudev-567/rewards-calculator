package com.test.rewardscalculator.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CustomerTransactionsAcquirer {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerTransactionsAcquirer.class);

    /**
     * Retrieve transactions of all customers.
     *
     * @return
     */
    public List<Customer> acquireAllCustomersTransactions() {
        ObjectMapper mapper = new ObjectMapper();
        DefaultResourceLoader loader = new DefaultResourceLoader();
        List<Customer> customers = null;
        Resource resource = loader.getResource("customerTransactions.json");
        try {
            customers = mapper.readValue(resource.getInputStream(), new TypeReference<List<Customer>>() {
            });
        } catch (IOException e) {
            LOG.error("Cannot deserialize from provided file");
        }
        return customers;
    }

    /**
     * retireive transactions of given customer
     *
     * @param customerId
     * @return
     */
    public Customer retrieveCustomerTransactions(String customerId) {
        List<Customer> customers = acquireAllCustomersTransactions();
        return customers.stream().
                filter(customer -> customerId.equals(customer.getCustomerId())).
                findFirst().
                get();
    }
}
