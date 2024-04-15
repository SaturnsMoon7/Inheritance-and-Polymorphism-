public class FireEnemy extends Enemy
{
    public FireEnemy(int health, float speed)
    {
        super(health, speed);
    }

    @Override
    public void attack()
    { System.out.println("Fire enemy has attacked"); }
}
