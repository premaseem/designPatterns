package com.premaseem.singleton;

public class Singleton {

	// Have a private constructor so that it cannot be instanciate other then
	// from this class.
	private Singleton() {
	}

	public static final Singleton uniqueInstance = new Singleton();
	public int stateholder = 1;

	public void doCounting() {
		System.out.println("Each time this method is called, it current state would get incremanted by 5");
		for (int i = 1; i <= 5; i++,stateholder++)
			System.out.println("Count is " + stateholder);
	}

}
