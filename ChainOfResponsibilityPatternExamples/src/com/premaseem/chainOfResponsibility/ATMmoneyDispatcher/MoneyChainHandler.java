package com.premaseem.chainOfResponsibility.ATMmoneyDispatcher;

public abstract class MoneyChainHandler {
	MoneyChainHandler nextHandler = null;
	Integer noteDenomination = 0;

	public MoneyChainHandler setNextHandler(MoneyChainHandler nextHandler) {
		this.nextHandler = nextHandler;
		return this.nextHandler;
	}

	public void handler(int dollarBill) {
		int notes = dollarBill / noteDenomination;
		int remainingAmount = dollarBill % noteDenomination;

		if (notes > 0) {
			System.out.printf("dispatched %d X %d = %d handled by %s \n", noteDenomination, notes, (noteDenomination * notes),this.getClass().getSimpleName());

		}
		if (nextHandler != null && remainingAmount > 0) {
			nextHandler.handler(remainingAmount);
		}
	}

}

class ThousandollarHandler_1000 extends MoneyChainHandler {
	public ThousandollarHandler_1000(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class FiveHundredollarHandler_500 extends MoneyChainHandler {
	public FiveHundredollarHandler_500(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class HundrendollarHandler_100 extends MoneyChainHandler {
	public HundrendollarHandler_100(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class FiftydollarHandler_50 extends MoneyChainHandler {
	public FiftydollarHandler_50(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class TendollarHandler_10 extends MoneyChainHandler {
	public TendollarHandler_10(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class FivedollarHandler_5 extends MoneyChainHandler {
	public FivedollarHandler_5(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class TwodollarHandler_2 extends MoneyChainHandler {
	public TwodollarHandler_2(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}

class OnedollarHandler_1 extends MoneyChainHandler {
	public OnedollarHandler_1(Integer noteDenomination) {
		this.noteDenomination = noteDenomination;
	}
}
