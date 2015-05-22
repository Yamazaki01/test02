package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatisticsDTOTest {
	@Test
	public void testGetProfit() {
		double profit = 9.999999;
		StatisticsDTO expected = new StatisticsDTO();
		expected.setProfit(9.999999);
		assertSame(profit, expected.getProfit());
	}
	@Test
	public void testSetProfit() {
		double profit = 9.999999;
		StatisticsDTO expected = new StatisticsDTO();
		expected.setProfit(9.999999);
		double value = expected.getProfit();
		assertSame(value, profit);
	}
}

