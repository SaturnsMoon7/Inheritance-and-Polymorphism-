public class ThreePainedWindow extends Window
{
    private int padding;

    public ThreePainedWindow(int width, int length, int padding)
    {
        super(width, length);
        this.padding = padding;
    }

    public void displayWindowType()
    { System.out.println("This is a pained window"); }
}
