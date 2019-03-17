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
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		
		 accountDao.addAccount(account);
	}

	@Override
	public Account getAccount(long id) {
		// TODO Auto-generated method stub
		return accountDao.getAccount(id);
	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		 accountDao.updateAccount(account);
	}

	@Override
	public void deleteAccount(long id) {
		// TODO Auto-generated method stub
		accountDao.deleteAccount(new Long(id));
		
	}
}
