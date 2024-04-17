public class FightingQuest extends Quest
{
    private int bossHealth;

    public FightingQuest(String name, String location, String reward, Priority priority, Difficulty difficulty, int bossHealth)
    {
        super(name, location, reward, priority, difficulty);
        this.bossHealth = bossHealth;
    }

    @Override
    public void display()
    { System.out.println("The boss at: " + super.GetLocation() + " has a health of: " + bossHealth);}
}
