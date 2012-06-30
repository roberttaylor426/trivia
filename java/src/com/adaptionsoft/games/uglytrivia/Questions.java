package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;
import java.util.List;


public class Questions {

	public List<String> popQuestions = new LinkedList<String>();
	private Question question;

	public Questions(Question question, int questionCount) {
		this.question = question;
		addQuestions(questionCount);
	}

	private void addQuestion(int questionNumber) {
		popQuestions.add(getQuestionPrefix() + questionNumber);
	}

	private String getQuestionPrefix() {
		return question.getPrefix();
	}

	private void addQuestions(int numberOfQuestions) {
		for (int i = 0; i < numberOfQuestions; i++)
			addQuestion(i);
	}

	public String takeNextQuestion() {
		return popQuestions.remove(0);
	}
}