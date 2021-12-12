package com.springdemo;

public class CustomerManager implements ICustomerService {
	//is kurallari islendi
	
	private ICustomerDal CustomerDal;
	public void add() {
		
		CustomerDal.add();
	}
	public CustomerManager(ICustomerDal customerDal) {
		super();
		CustomerDal = customerDal;
	}
	

}
