package com.premaseem.client;

import java.util.Scanner;

import com.premaseem.strategy.AirthematicOperationStrategy;
import com.premaseem.strategy.impl.AdditionStragegy;
import com.premaseem.strategy.impl.MultiplicationStragegy;
import com.premaseem.strategy.impl.SubstractionStragegy;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("This is the Client Main file for Strategy Pattern");
		System.out.println("Client has several Stragegy which can be consumed at run time ");
		System.out.println("Please input 2 number and the stragatic mathematical operation code you want to add ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number ");
        Integer num1 = scan.nextInt();
		System.out.println("Pleaes enter second number");
		Integer num2 = scan.nextInt();
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("Please enter OPERATION CODE, on the run time strategy would be picked based on your choice of operation");
		String operationCode = scan.next();
		AirthematicOperationStrategy strategy = null;
		if (operationCode.contains("ADD")){
			strategy = new AdditionStragegy();
		}
		
		if (operationCode.contains("SUB")){
			strategy = new SubstractionStragegy();
		}
		
		if (operationCode.contains("MUL")){
			strategy = new MultiplicationStragegy();
		}
		
		
		System.out.printf("You picked stragety as %s",operationCode);
        System.out.println();
        if(strategy !=null){
		System.out.printf("Final result is %d",strategy.performOperation(num1, num2));
        } else {
        	System.out.println("Invalid operation picked :-( ");
        }
		System.out.println();
		System.out.println("                 Thanks by Prem Aseem ");

		
	}

}
