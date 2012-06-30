package com.adaptionsoft.games.uglytrivia;

import static com.adaptionsoft.games.uglytrivia.Question.POP;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class QuestionsTest {

	@Test
	public void shouldTakeNextQuestion() {
		Questions questions = new Questions(POP, 1);
		
		assertThat(questions.takeNextQuestion(), equalTo(POP.getPrefix() + "0"));
	}
}
