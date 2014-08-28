package com.premaseem.strategy.impl;

import com.premaseem.strategy.AirthematicOperationStrategy;

public class AdditionStragegy implements AirthematicOperationStrategy {

	@Override
	public Integer performOperation(Integer num1, Integer num2) {
		return num1 + num2;
	}

}
