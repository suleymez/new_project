package com.example.dialy.servise;

import com.example.dialy.model.Account;

import java.util.List;

public interface IAccountService {

    Account create(Account account);

    List<Account> getAll();

    Account findById(Long id);

    void deleteById(Long id);

}
