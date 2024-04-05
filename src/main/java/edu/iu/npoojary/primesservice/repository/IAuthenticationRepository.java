package edu.iu.npoojary.primesservice.repository;

import edu.iu.npoojary.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {

    boolean save (Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}
