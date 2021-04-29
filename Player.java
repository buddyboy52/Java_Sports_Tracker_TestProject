public abstract class Player
{	
	//variables
	private String firstName;
	private String lastName;
    private int age;
	private int weightLbs;
	
	//constructor for general data
	public Player(String firstName, String lastName, int age, int weightLbs)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weightLbs = weightLbs;
	}
	
	//get methods
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
    public int getAge()
    {
        return this.age;
    }
	public int getWeightLbs()
	{
		return this.weightLbs;
	}
	
	public abstract String toString();
	public abstract String displayPlayer();
}