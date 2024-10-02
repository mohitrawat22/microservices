package com.mor.accounts.service;

import com.mor.accounts.dto.CustomerDto;

public interface IAccountsService {
    public void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
