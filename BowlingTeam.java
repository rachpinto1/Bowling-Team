// Chapter 8 practice exercise

public class BowlingTeam
{
	// instance variables for the class
	private String teamName;
	private String[] members = new String[4];

	// mutator (setter) method for the teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}

	// accessor (getter) method for the teamName
	public String getTeamName()
	{
		return teamName;
	}

	// mutator (setter) method for the members array
	public void setMember(int number, String name)
	{
		members[number] = name;
	}

	// accessor (getter) method for the members array
	public String getMember(int number)
	{
		return members[number];
	}
} // end of class