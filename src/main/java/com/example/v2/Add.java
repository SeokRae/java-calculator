package com.example.v2;

public class Add extends AbstractCalculator {
	public Add(OperatorCondition operatorCondition) {
		super(operatorCondition);
	}
	
	@Override
	protected int operatorCalculator(int a, int b) {
		return a + b;
	}
}
