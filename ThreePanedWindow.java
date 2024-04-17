
public class ThreePanedWindow extends Window
{
    private int padding;

    public ThreePanedWindow(int width, int length, int padding)
    {
        super(width, length);
        this.padding = padding;
    }

    public void displayWindowType()
    { System.out.println("This is a pained window with a padding of " + padding + "cm"); }
}
