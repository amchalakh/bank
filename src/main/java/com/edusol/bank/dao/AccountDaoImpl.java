package com.edusol.bank.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.edusol.bank.dto.Account;


@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;
	//AccountRepository accountRepository;
	
	@Override
	@Transactional
	public void addAccount(Account account) {

		//Session session = this.sessionFactory.getCurrentSession();
		System.out.println(account.getName());
		System.out.println(account.getCity());
		this.sessionFactory.getCurrentSession().save(account);

		return ;
	}
	
	@Override
	public Account getAccount(long id) {
		Account account = this.sessionFactory.getCurrentSession().load(Account.class, id);
		return account;
	}
	
	
	@Override
	@Transactional
	public void updateAccount(Account account) {
		this.sessionFactory.getCurrentSession().update(account);

		return ;
	}
	
	@Override
	@Transactional
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setId(id);
		this.sessionFactory.getCurrentSession().delete(account);
		
	}
	/*
	 * @Override public List<Account> findAll() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public List<Account> findAll(Sort sort) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public List<Account> findAllById(Iterable<Long> ids) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Account> List<S> saveAll(Iterable<S> entities) {
	 * // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public void flush() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public <S extends Account> S saveAndFlush(S entity) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void deleteInBatch(Iterable<Account> entities) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public Account getOne(Long id) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public <S extends Account> List<S> findAll(Example<S> example) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Account> List<S> findAll(Example<S> example, Sort
	 * sort) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Page<Account> findAll(Pageable pageable) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override
	 * 
	 * public S save(S entity) { // TODO Auto-generated method stub return
	 * "success"; }
	 * 
	 * 
	 * public <S extends Account> S save(S entity) { // TODO Auto-generated method
	 * return null; }
	 * 
	 * 
	 * @Override public Optional<Account> findById(Long id) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public boolean existsById(Long id) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public long count() { // TODO Auto-generated method stub return 0;
	 * }
	 * 
	 * @Override public void deleteById(Long id) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void delete(Account entity) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll(Iterable<? extends Account> entities) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public <S extends Account> Optional<S> findOne(Example<S> example)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Account> Page<S> findAll(Example<S> example,
	 * Pageable pageable) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Account> long count(Example<S> example) { // TODO
	 * Auto-generated method stub return 0; }
	 * 
	 * @Override public <S extends Account> boolean exists(Example<S> example) { //
	 * TODO Auto-generated method stub return false; }
	 */




	

}
