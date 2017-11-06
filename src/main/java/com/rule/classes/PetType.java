package com.rule.classes;

public enum PetType {
	DOG("dog"),
	CAT("cat"),
	FISH("fish"),
	BIRD("bird")
	;
	
	private final String text;
	
	private PetType(final String text) {
		this.text = text;
	}
	
	@Override
    public String toString() {
        return text;
    }
}
