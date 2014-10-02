package com.premaseem.chainOfResponsibility.loggerProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.premaseem.chainOfResponsibility.loggerProgram.LogHandler.LOG_LEVEL;

public class ClientFileForLoggerProgram {

	public static void main(String[] args) {

		System.out.println("Welcome to Number identifier program designed using Chain of Responsibility ");
		Scanner scan = new Scanner(System.in);
		LogHandler logHandler =null;
		LogHandler infologHandler = new InfoLogHandler();	
		LogHandler DebugLogHandler = new DebugLogHandler();
		LogHandler ErrorLogHandler = new ErrorLogHandler();
		LogHandler FatalLogHandler = new FatalLogHandler();
		LogHandler CriticalLogHandler = new CriticalLogHandler();
		// Setting up the change
		infologHandler.setNextHandler(DebugLogHandler);
		DebugLogHandler.setNextHandler(ErrorLogHandler);
		ErrorLogHandler.setNextHandler(FatalLogHandler);
		FatalLogHandler.setNextHandler(CriticalLogHandler);
		
		List<LogHandler> logHandlers = new ArrayList<LogHandler>(10);
		logHandlers.add(0,infologHandler);
		logHandlers.add(1,CriticalLogHandler);
		logHandlers.add(2,FatalLogHandler);
		logHandlers.add(3,ErrorLogHandler);
		logHandlers.add(4,DebugLogHandler);
		logHandlers.add(5,infologHandler);


		String repeatRunFlag = "y";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Please enter message to be logged ");
			String message = scan.next();
			System.out.println("Please choose the level from 1 to 5 for logging ");
			System.out.println("INFO(5),		DEBUG(4),		ERROR(3),		FATAL(2),		CRITICAL(1)");
			try{
			int choice = scan.nextInt();
				logHandler = logHandlers.get(choice);
			}catch (Exception e){
				logHandler = logHandlers.get(0);
			}
			logHandler.handler(message);

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat ....  ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "n";
			}
		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");	

	}
}
