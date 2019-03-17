package com.edusol.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edusol.bank.dto.Account;

public interface AccountDao {
	
	void addAccount(Account account);
	Account getAccount(long id);
	void updateAccount(Account account);
	void deleteAccount(Long id);

	

}
