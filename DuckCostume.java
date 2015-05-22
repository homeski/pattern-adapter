// The cool new software came packaged with sample costumes
public class DuckCostume extends AnimalCostume
{
	private String color;
	private String name;
	private String noise;

	public DuckCostume()
	{
		color = "yellow";
		name = "duck";
		noise = "quack";
	}

	public String getCostumeColor()
	{
		return color;
	}

	public String getAnimalNoise()
	{
		return noise;
	}

	public String getAnimalName()
	{
		return name;
	}
}