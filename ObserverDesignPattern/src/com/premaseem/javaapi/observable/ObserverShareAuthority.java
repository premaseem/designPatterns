package com.premaseem.javaapi.observable;

import java.util.Observable;
import java.util.Observer;

public class ObserverShareAuthority implements Observer {

	private ObservableShare subject = null;

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof ObservableShare) {
			System.out
					.println("Share Authority got the notification for share price update ");
			if (subject != null) {
				System.out
						.println("Latest price of share is recieved by Authority  "
								+ subject.getShareprice());
			}
		}

		if (arg0 instanceof ObservableGold) {
			System.out
					.println("Gold Authority got the notification for Gold price update ");
			System.out
					.println("Latest price of Gold is recieved by Authority  ");
		}

	}

	public ObservableShare getSubject() {
		return subject;
	}

	public void setSubject(ObservableShare subject) {
		this.subject = subject;
	}

}
