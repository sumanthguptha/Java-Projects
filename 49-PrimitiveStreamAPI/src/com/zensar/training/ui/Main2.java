package com.zensar.training.ui;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main2 {

	public static void main(String[] args) {
		
		DoubleStream ds=DoubleStream.of(16.0,22.0,7.0);
		System.out.println("sum:"+ds1.sum());
		long count=ds.count();
		System.out.println(count);
		
		DoubleStream ds1=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble=ds1.min();
		System.out.println(optionalDouble.getAsDouble());
		
		DoubleStream ds2=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble1=ds2.max();
		System.out.println(optionalDouble1.getAsDouble());
		
		DoubleStream ds3=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble=ds3.min();
		System.out.println(optionalDouble.getAsDouble());
	}

}
