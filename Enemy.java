public class Enemy 
{
    private int health;
    private float speed;
    
    public Enemy(int health, float speed)
    {
        this.health =  health;
        this.speed = speed;
    }

    public int getHealth()
    { return health; }

    public float getSpeed()
    { return speed; }

    public void attack()
    { System.out.println("Enemy has attacked"); }
}
