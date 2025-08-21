package com.bankwave.accounts.service;

import com.bankwave.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto -CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
    /**
     *
     * @param mobileNumber -Input Mobile Number
     * @retun Account Details based on given mobilenUmber
     */
    CustomerDto fetchAccount(String mobileNumber);
}
