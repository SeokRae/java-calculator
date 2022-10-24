package com.example.v2;

public class AddCondition implements OperatorCondition {
	private final Operator operator;
	
	public AddCondition() {
		this.operator = Operator.ADD;
	}
	
	@Override
	public boolean isMatchOperator(Operator operator) {
		return operator.equals(this.operator);
	}
}
