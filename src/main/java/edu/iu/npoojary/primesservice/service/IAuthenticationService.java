package edu.iu.npoojary.primesservice.service;

import edu.iu.npoojary.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {

    Customer register(Customer customer) throws IOException;

    boolean login(String username, String password) throws  IOException;
}
