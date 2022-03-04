package com.mokito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   static Calculator calculator=null;
   
	/*
	 * Creating service for our project
	 * 
	 * CalculatorService service= new CalculatorService() {
	 * 
	 * @Override public int operation(int a, int b) { // TODO Auto-generated method
	 * stub return a+b; } };
	 */
   
   ///Mocking the service through Mockito
   
   CalculatorService service=Mockito.mock(CalculatorService.class);
   
   @Before // @BeforeClass---> For 
   public  void beforeClass() {
	   calculator = new Calculator(service);
	   System.out.println("Constructing the class before testing");
   }
   
   @Test
   public void testAdd() {
	   System.out.println("Testing add method");
	   when(service.operation(2, 3)).thenReturn(5);// telling the service that whenever service.operation call return 5
	   assertEquals(10,calculator.perform(2, 3));
	   verify(service).operation(2, 3);//Verifying whether my service is working or not
   }
}
