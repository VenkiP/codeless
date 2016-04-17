import java.lang.reflect.Array;
import java.util.Vector;
import java.util.Enumeration;

public class Location {
	
	private String locationName;
	private String locationDescription;
	//private String givenCommand;
	private Vector exitsList;
	
	public Location()
	{
		
	}
	
	public Location (String name, String description)
	{
		locationName = name;
		locationDescription = description;
	}
	
	public String getLocation()
	{	
		return locationName + "\n" + locationDescription;
	}
	
	public void addExit(Exit exToAdd)
	{
		//exitsList.add();
	}
	
	public String showExits()
	{
		return "";
	}
	
	public String showLocation()
	{
		return locationName + "\n" + locationDescription;
	}
	
	public String toString()
	{
		return "";
	}

}
