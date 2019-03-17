package com.edusol.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edusol.bank.dto.Account;
import com.edusol.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	// produces="application/json",
	//@RequestMapping(value="/", method=RequestMethod.POST)
	@PostMapping("/")
	public HttpStatus addAccount(@RequestBody Account account) {
		accountService.addAccount(account);
		return HttpStatus.CREATED;

	}
	
	@GetMapping("/")
	public ResponseEntity<Account> getAccount(@RequestParam (value="id", required=true) long id) {
		Account account = accountService.getAccount(id);
		return new ResponseEntity<Account>(account, null, HttpStatus.OK);
	}
	
	@PutMapping("/")
	public  HttpStatus   updateAccount(@RequestBody Account account) {
		 accountService.updateAccount(account);
		return  HttpStatus.OK;
	}
	
	@DeleteMapping("/")
	public HttpStatus deleteAccount(@RequestParam (value="id", required=true) long id) {
		 accountService.deleteAccount(id);
		return HttpStatus.OK;
	}

}
