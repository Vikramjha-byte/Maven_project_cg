package com.mokito;

public class Calculator{
	
	////Aggregation: Calculator Has-A CalculatorService, Dependent relationship
	
	CalculatorService service;
	public Calculator(CalculatorService service2) {
		// TODO Auto-generated constructor stub
		this.service=service2;
	}
	public int perform(int i,int j) {
		return service.operation(i, j)*i;
	}

}
