package kz.sev.Constructor;

public class Elements
{
	private String name;
	private boolean chek;
	
	
	public Elements(String name,boolean chek)
	{
		this.name = name;
		this.chek = chek;
		//System.out.println(this.name);
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	/*public void setName(String name) 
	{
		this.name = name;
	}*/

	
	public boolean getChek() 
	{
		return chek;
	}

	/*public void setChek(boolean chek) 
	{
		this.chek = chek;
	}*/

}
