package com.premaseem.javaapi.push.observable;

import java.util.Observable;
import java.util.Observer;

public class ShareBrokerObservable implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof ShareSubject1) {
			ShareSubject1 shareSubject1 = (ShareSubject1) arg0;
			if (arg1 == null) {
				System.out.println("Pulling initial price " + shareSubject1.getInitialPrice());
			} else
				System.out.println("Pushed final price is  " + arg1.toString());

		}
	}
}
