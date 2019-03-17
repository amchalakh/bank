package com.edusol.bank.service;

import com.edusol.bank.dto.Account;

public interface AccountService {
	
	void addAccount(Account account);
	Account getAccount(long id);
	void updateAccount(Account account);
	void deleteAccount(long l);

}
