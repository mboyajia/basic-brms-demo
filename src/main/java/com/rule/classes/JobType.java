package com.rule.classes;

public enum JobType {
	DOCTOR("doctor"),
	LAWYER("lawyer"),
	DEVELOPER("developer"),
	SALES("sales"),
	ATHLETE("athlete")
	;

	private final String text;
	
	private JobType(final String text) {
		this.text = text;
	}
	
	@Override
    public String toString() {
        return text;
    }
}
