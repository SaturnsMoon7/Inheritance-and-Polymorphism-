public class AirEnemy extends Enemy
{
    public AirEnemy(int health, float speed)
    {
        super(health, speed);
    }

    @Override
    public void attack()
    { System.out.println("Air enemy has attacked"); }
}
