package chapterExamples;

import java.security.SecureRandom;
public class ArcheryGame {

	public static void main(String[] args) {
		
		SecureRandom scores = new SecureRandom();
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int[][] scoresOfPlayers = new int[3][4]; // initialize a two-dimensional array with 3 rows and 4 columns
		
		// Player name, 1st chance score, 2nd chance score, 3rd chance score, total of scores for each player
		System.out.printf("%18s %10s %10s %10s%n","Player 1",    "Player 2",    "Player 3",   "Player 4");
		for(int i = 0; i < scoresOfPlayers.length; i++) {
			if(i == 0 || i == 1 || i == 2) {
				System.out.printf("%d Shot", i+1);
				for(int j = 0; j < scoresOfPlayers[i].length; j++) {
					int randomScore = scores.nextInt(11);
					scoresOfPlayers[i][j] = randomScore;
					System.out.printf("%10d ", scoresOfPlayers[i][j]);
					}
			}
			
			if(scoresOfPlayers[i].length % 4 == 0) {
				System.out.println();
			}

		}
		total1 = scoresOfPlayers[0][0] + scoresOfPlayers[1][0] + scoresOfPlayers[2][0];
		total2 = scoresOfPlayers[0][1] + scoresOfPlayers[1][1] + scoresOfPlayers[2][1];
		total3 = scoresOfPlayers[0][2] + scoresOfPlayers[1][2] + scoresOfPlayers[2][2];
		total4 = scoresOfPlayers[0][3] + scoresOfPlayers[1][3] + scoresOfPlayers[2][3];
		
		System.out.printf("Total: %9d %10d %10d %10d", total1, total2, total3, total4);
		
		
	}

}
