package com.adaptionsoft.games.uglytrivia;

enum Question {
	POP("Pop Question "),
	SCIENCE("Science Question "),
	SPORT("Sports Question "),
	ROCK("Rock Question ");
	
	private final String questionPrefix;

	private Question(String questionPrefix) {
		this.questionPrefix = questionPrefix;
	}

	public String getPrefix() {
		return questionPrefix;
	}
}