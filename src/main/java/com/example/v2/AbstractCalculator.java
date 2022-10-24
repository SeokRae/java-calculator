package com.example.v2;

import java.util.List;

public abstract class AbstractCalculator implements Calculable {
	
	private final List<OperatorCondition> operatorConditions;
	
	protected AbstractCalculator(OperatorCondition... operatorConditions) {
		this.operatorConditions = List.of(operatorConditions);
	}
	
	@Override
	public int calculate(Operator op, int a, int b) {
		for(OperatorCondition operatorCondition : operatorConditions) {
			if(operatorCondition.isMatchOperator(op)) {
				return operatorCalculator(a, b);
			}
		}
		return 0;
	}
	
	protected abstract int operatorCalculator(int a, int b);
}
