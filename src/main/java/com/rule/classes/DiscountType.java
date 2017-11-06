package com.rule.classes;

public enum DiscountType {
	DOCTOR("doctor"),
	FEMALE60("female60"),
	MALE30("male30"),
	ATHLETE("athlete"),
	PETOWNER("petowner")
	;
	
	private final String text;
	
	private DiscountType(final String text) {
		this.text = text;
	}
	
	@Override
    public String toString() {
        return text;
    }
}
