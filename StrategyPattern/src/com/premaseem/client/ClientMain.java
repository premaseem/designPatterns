package com.premaseem.client;

import java.util.Scanner;

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
		
		
		System.out.printf("You picked stragety as %s",operationCode);
        System.out.println();
		System.out.println("Final result is ");
		
		System.out.println("Thanks by Prem Aseem ");

		
	}

}
