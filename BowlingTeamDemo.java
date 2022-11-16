// Chapter 8 practice exercise

import java.util.*;

public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		BowlingTeam bowlTeam = new BowlingTeam();

		// input phase
		System.out.print("Please enter team name >>");
		name = input.nextLine();
		bowlTeam.setTeamName(name);

		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print("Please enter the name of member " + (x + 1) + ">> ");
			name = input.nextLine();
			bowlTeam.setMember(x, name);
		} //end of for loop

		// output phase
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print(bowlTeam.getMember(x) + " ");
		} //end of for loop
	} // end of main()
} // end of class