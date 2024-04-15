public class WaterEnemy extends Enemy
{
    public WaterEnemy(int health, float speed)
    {
        super(health, speed);
    }
    
    @Override
    public void attack()
    { System.out.println("Water enemy has attacked"); }
}
