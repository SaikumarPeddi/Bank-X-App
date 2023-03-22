package com.bankxapp.main.Service;

import com.bankxapp.main.Entity.AccountType;
import com.bankxapp.main.Entity.Accounts;
import com.bankxapp.main.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;

    public void onboardCustomer(Customer customer) {
        List<Accounts> accounts = new ArrayList<>();
        Accounts currentAccount = new Accounts();
        currentAccount.setAccountType(AccountType.CURRENT);
        currentAccount.setBalance(BigDecimal.ZERO);
        currentAccount.setCustomer(customer);
        accounts.add(currentAccount);
        Accounts savingsAccount = new Accounts();
        savingsAccount.setAccountType(AccountType.SAVINGS);
        savingsAccount.setBalance(BigDecimal.valueOf(500));
        savingsAccount.setCustomer(customer);
        accounts.add(savingsAccount);
        ( customer).setAccounts(accounts);
        customerRepository.save(customer);
    }

    public void createAccount(Customer customer, AccountType type) {
        Accounts account = new Accounts();
        account.setAccountType(type);
        account.setBalance(BigDecimal.ZERO);
        account.setCustomer(customer);
        accountRepository.save(account);
    }

    public void transferMoney(Accounts fromAccount, Accounts toAccount, BigDecimal amount) {


    }
    }

