package com.example.demo.domain.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Amount {
	
	public abstract long value();

	public static Amount create(int value) {
		return new AutoValue_Amount(value);
	}
	
	public Amount plus(Amount other) {
		long result = Math.addExact(value(), other.value());
		return new AutoValue_Amount(result);
	}
	
	public Amount minus(Amount other) {
		long result = Math.subtractExact(value(), other.value());
		return new AutoValue_Amount(result);
	}
	
	public boolean isGreaterThanOrEqualTo(Amount other) {
		return value() >= other.value();
	}
	
}
