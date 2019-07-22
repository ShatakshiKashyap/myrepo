package com.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.AccountDAOImpl;

public class ServiceDAOImplTest {
private static final String TEST_ACCOUNT_NO="1234";
private ServiceDAOImpl servicedaoImpl;
    @Before
    public void setUp() throws Exception {
    	servicedaoImpl =new ServiceDAOImpl(new AccountDAOImpl());
    	servicedaoImpl.createAccountForCustomer(TEST_ACCOUNT_NO);
    	servicedaoImpl.deposit(TEST_ACCOUNT_NO, 1000);
    }
    
	@Test
	public void testdeposit() {
		servicedaoImpl.deposit(TEST_ACCOUNT_NO, 50);
		assertEquals(servicedaoImpl.getBalance(TEST_ACCOUNT_NO),1050,0);
	}
	/*@Test
	public void testdeposit() {
		servicedaoImpl.deposit(TEST_ACCOUNT_NO, 50);
		assertEquals(servicedaoImpl.getBalance(TEST_ACCOUNT_NO),150,0);
	}*/

}
