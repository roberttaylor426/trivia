package com.adaptionsoft.games.uglytrivia;

import static org.approvaltests.Approvals.approve;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.adaptionsoft.games.trivia.runner.GameRunner;

public class GameRunnerTest {
	
	@Test
	public void blatSomeValuesThrough() throws Exception {
		
		final StringBuilder output = new StringBuilder();
		System.setOut(new PrintStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				output.append(String.valueOf((char)b));
			}
		}));
		
		String[] randomSeeds = createRandomSeeds();
		
		for (String seed : randomSeeds)
			GameRunner.main(new String[]{seed});
		
		approve(output.toString());
	}
	
	public String[] createRandomSeeds() {
		String[] randomSeeds = new String[100];
		
		for (int i = 0; i < randomSeeds.length; i++)
			randomSeeds[i] = String.valueOf(i);
		
		return randomSeeds;
	}
}