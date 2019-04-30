package calenderProject;

public class Date 
{
	private int date;
	private String activity;
	
	public Date(int initDate, String initActivity) 
	{
		date = initDate;
		activity = initActivity;
	}
	
	public int getDate()
	{
		return date;
	}
	
	public String getActivity()
	{
		return activity;
	}
}

