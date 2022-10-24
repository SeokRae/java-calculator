package com.example.v2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculableTest {
	
	@DisplayName("인터페이스와 상속으로 연산 처리 구성 테스트")
	@Test
	void testCase1() {
		// given
		Calculable calculable = new Add(new AddCondition());
		
		// when
		int calculate = calculable.calculate(Operator.ADD, 1, 2);
		
		// then
		assertThat(calculate).isEqualTo(3);
	}
}