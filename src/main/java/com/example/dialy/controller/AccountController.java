package com.example.dialy.controller;

import com.example.dialy.model.Account;
import com.example.dialy.servise.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(accountService.getAll());
    }

    @GetMapping("/accountId/{accountId}")
    public ResponseEntity<Account> getById(@PathVariable Long accountId) {
        return ResponseEntity.ok().body(accountService.findById(accountId));
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account account) {
        return ResponseEntity.ok().body(accountService.create(account));
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<?> delete(@PathVariable Long accountId) {
        accountService.deleteById(accountId);
        return new ResponseEntity(HttpStatus.OK);
    }

}

