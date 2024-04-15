public class StainedGlassWindow extends Window
{
    private String colour;

    public StainedGlassWindow(int width, int length, String colour)
    {   
        super(width, length);
        this.colour = colour;
    }

    public void displayWindowType()
    { System.out.println("This is a stained window"); }
}
