// Custom code is written so that clients written with only dogs in mind can be fitted to use the new software
public class CinnamonCostumeAdapter implements Dog
{
	private AnimalCostume costume;

	public CinnamonCostumeAdapter(AnimalCostume costume)
	{
		this.costume = costume;
	}

	public void bark()
	{
		System.out.format("%s %s %s\n", costume.getAnimalNoise(), costume.getAnimalNoise(), costume.getAnimalNoise());
	}

	public String getColor()
	{
		return costume.getCostumeColor();
	}

	public String getName()
	{
		return costume.getAnimalName();
	}
}