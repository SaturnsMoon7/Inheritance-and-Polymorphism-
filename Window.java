public class Window 
{
    private int length;
    private int width;
    private boolean isOpen;

    public Window(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void toggleWindow()
    {
        this.isOpen = !this.isOpen;
        System.out.println("Window is open: " + this.isOpen);
    }
}
