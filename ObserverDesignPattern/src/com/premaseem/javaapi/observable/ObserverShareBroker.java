package com.premaseem.javaapi.observable;

import java.util.Observable;
import java.util.Observer;

public class ObserverShareBroker implements Observer {

	private ObservableShare subject = null;

	@Override
	public void update(Observable arg0, Object arg1) {

		if (arg0 instanceof ObservableShare) {
			System.out
					.println("Share broker1 got the notification for share price update ");
			System.out
					.println("He can now choose to pull data from the subject ");
			if (subject != null) {
				System.out.println("Latest price of share is "
						+ subject.getShareprice());
			}
		}
	}

	public ObservableShare getSubject() {
		return subject;
	}

	public void setSubject(ObservableShare subject) {
		this.subject = subject;
	}

}
