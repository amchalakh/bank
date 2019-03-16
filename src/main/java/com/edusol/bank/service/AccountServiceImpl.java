package com.edusol.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.edusol.bank.dao.AccountDao;

import com.edusol.bank.dto.Account;

@Service
public class AccountServiceImpl  implements AccountService{

	@Autowired
	AccountDao accountDao;
	
	@Override
	public String addAccount(Account account) {
		// TODO Auto-generated method stub
		
		return accountDao.addAccount(account);
	}

	@Override
	public Account getAccount(long id) {
		// TODO Auto-generated method stub
		return accountDao.getAccount(id);
	}
}
