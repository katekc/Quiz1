package baseball;

import java.util.Scanner;

public class Stats {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// name
		System.out.println("Enter the player's name: ");
		String name = stdin.nextLine();
		// at bats (AB)
		System.out.println("Enter the player's at bats: ");
		float bats = stdin.nextFloat();
		// hits (H)
		System.out.println("Enter the player's hits: ");
		float hits = stdin.nextFloat();
		// doubles (2B)
		System.out.println("Enter the player's doubles: ");
		float doubles = stdin.nextFloat();
		// triples (3B)
		System.out.println("Enter the player's triples: ");
		float triples = stdin.nextFloat();
		// home runs (HR)
		System.out.println("Enter the player's home runs: ");
		float homeRuns = stdin.nextFloat();
		// runs (R)
		System.out.println("Enter the player's runs: ");
		float runs = stdin.nextFloat();
		// walks (BB)
		System.out.println("Enter the player's walks: ");
		float walks = stdin.nextFloat();
		
		stdin.close();
		
		// batting average (BA)
		float batAverage = hits / bats;
		// on base percentage (OBP)
		float basePercent = (walks + hits) / bats;
		// slugging percentage (SLG)
		float slugPercent = ((hits-doubles-triples-homeRuns) + doubles*2 + triples*3 + homeRuns*4)/bats;
		// on base + slugging percentage (OBS)
		float baseSlugPercent = basePercent + slugPercent;
		// total bases (TB)
		float totalBases = (hits-doubles-triples-homeRuns) + doubles*2 + triples*3 + homeRuns*4 + runs;
		
		System.out.println("Name: " + name);
		System.out.println("BA: " + batAverage);
		System.out.println("OBP: " + basePercent);
		System.out.println("SLG: " + slugPercent);
		System.out.println("OBS: " + baseSlugPercent);
		System.out.println("TB: " + totalBases);
	}
	}
	