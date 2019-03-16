package com.edusol.bank.service;

import com.edusol.bank.dto.Account;

public interface AccountService {
	
	String addAccount(Account account);
	Account getAccount(long id);

}
