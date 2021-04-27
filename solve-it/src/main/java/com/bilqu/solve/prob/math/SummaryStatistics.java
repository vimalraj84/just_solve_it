package com.bilqu.solve.prob.math;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatistics {

	public static void main(String[] args) {
		IntSummaryStatistics statistics = IntStream.of(10,34,54,12,98).summaryStatistics();
		System.out.println(statistics);
		
	}

}
