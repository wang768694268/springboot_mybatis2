package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("findAll")
    public List<Account> findAll() {
        List<Account> accountList = accountService.findAll();
        return accountList;
    }

    @RequestMapping("saveAccount")
    public void saveAccount() {
        Account account = new Account();
        account.setName("wang");
        account.setMoney(111.1);
        accountService.saveAccount(account);

    }
}
