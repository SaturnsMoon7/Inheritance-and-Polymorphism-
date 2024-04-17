
// Enum for the types of priority and difficulty of specified quest
enum Priority
{
    Low,
    Medium,
    High
}

enum Difficulty
{
    Beginner,
    Intermediate,
    Advanced,
    Nightmare
}


// Creates a class named "Quest"
public class Quest
{
    // Instance variables
    private String name;
    private String location;
    private String reward;

    // Data types of following are enums stated at top
    private Priority priority;
    private Difficulty difficulty;

    // The constructor used when creating a new quest object
    // Takes in name, location, reward, priority, difficulty 
    public Quest(String name, String location, String reward, Priority priority, Difficulty difficulty)
    {
        this.name = name;
        this.location = location;
        this.reward = reward;
        this.priority = priority;
        this.difficulty = difficulty;
    }


    // "Getters" ~ Methods that return the value of variable asked
    // Maintains encapsulation as user won't have direct access to instance variables
    public String GetName() { return name; }

    public String GetLocation() { return location; }

    public String GetReward() { return reward; }

    public Priority GetPriority() { return priority; }

    public Difficulty GetDifficulty() { return difficulty; }



    // "Setters" ~ Methods that change the value of the variable
    // Takes in the new value to which change the old one.
    public void SetName(String newName)
    { name = newName; }

    public void SetLocation(String newLocation)
    {  location = newLocation; }

    public void SetReward(String newReward)
    { reward = newReward; }

    public void SetPriority(Priority newPriority)
    { priority = newPriority; }

    public void SetDifficulty(Difficulty newDifficulty)
    { difficulty = newDifficulty;}

    public void display()
    { System.out.println("The '" + name + "' quest is at :" + location);  }
}