// This virtual dog is named Cinnamon
public class Cinnamon implements Dog
{
	private String color;
	private String name;

	public Cinnamon()
	{
		color = "brown";
		name = "Cinnamon";
	}

	public void bark()
	{
		System.out.println("woof! woof! woof!");
	}

	public String getColor()
	{
		return color;
	}

	public String getName()
	{
		return name;
	}
}