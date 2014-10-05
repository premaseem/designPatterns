package com.premaseem.interpreterPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Interpreter Design pattern which interpretes your date format accross all languages ");
		Scanner scan = new Scanner(System.in);

		// Object initialization block

		// User input block
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {

		System.out.println("Please select the Expression  : 'MM-DD-YYYY' or 'YYYY-MM-DD'");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();

		Context context = new Context();
		context.setExpression(expression);
		context.setDate(new Date());

		ArrayList<AbstractExpression> expressionOrderList = getExpressionOrder(context);

		System.out.println("Input : " + context.getExpression() + " : " + new Date());

		for (AbstractExpression abstractExpression : expressionOrderList) {
			abstractExpression.evaluate(context);
			System.out.println(abstractExpression.getClass().getSimpleName() + " Evaluated     : " + context.getExpression());

		}

		System.out.println("Output : " + context.getExpression());
		
		System.out.println("Press No to Exit and any other character to repeat  .... ");
		try {
			repeatRunFlag = scan.next();
		} catch (Exception e) {
			repeatRunFlag = "no";
		}

	}

	System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
	System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");
	}

	private static ArrayList<AbstractExpression> getExpressionOrder(Context context) {
		ArrayList<AbstractExpression> expressionOrderList = new ArrayList<AbstractExpression>();
		String[] strArray = context.getExpression().split("-");
		for (String string : strArray) {
			if (string.equalsIgnoreCase("MM")) {
				expressionOrderList.add(new MonthExpression());
			} else if (string.equalsIgnoreCase("DD")) {
				expressionOrderList.add(new DayExpression());
			} else {
				expressionOrderList.add(new YearExpression());
			}

		}
		return expressionOrderList;
	}
}
