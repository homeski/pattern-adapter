public class CentralPark
{
	public static void main(String[] args)
	{
		Dog cinnamon = new Cinnamon();

		System.out.println("Let's go for a walk Cinnamon!");
		cinnamon.bark();
		System.out.println("Cinnamon, what color are you??");
		System.out.format("I'm %s!\n", cinnamon.getColor());
		System.out.println("Cinnamon, what's your name??");
		System.out.format("%s!!!\n\n", cinnamon.getName());

		// Let's do this again with our new adapter

		AnimalCostume duckCostume = new DuckCostume();
		Dog cinnamonInACostume = new CinnamonCostumeAdapter(duckCostume);

		// No need to change our old code, it still works
		System.out.println("Let's go for a walk Cinnamon!");
		cinnamonInACostume.bark();
		System.out.println("Cinnamon, what color are you??");
		System.out.format("I'm %s!\n", cinnamonInACostume.getColor());
		System.out.println("Cinnamon, what's your name??");
		System.out.format("%s!!!\n", cinnamonInACostume.getName());		
	}
}