class Main
{
    public static void main(String[] args)
    {
        Student newStudent = new Student();
        Student.study();

        StudentCouncilMember newStudentCouncilMember = new StudentCouncilMember();
        newStudentCouncilMember.attendMeeting();
        newStudentCouncilMember.study();

        Racecar newRacecar = new Racecar(200, "pink");
        newRacecar.getColour();

        Window newWindow = new Window(10, 5);
        newWindow.toggleWindow();

        StainedGlassWindow newStainedWindow = new StainedGlassWindow(2, 4, "Red");
        newStainedWindow.displayWindowType();
        newStainedWindow.toggleWindow();

        ThreePainedWindow newPainedWindow = new ThreePainedWindow(4, 6, 2);
        newPainedWindow.displayWindowType();

        Date newDate = new Date(2006, 4, 12);
        newDate.displayDate();

        Holiday newHoliday = new Holiday(0, 12, 25, "Christmas");
        System.out.println(newHoliday.getTitle());
        newHoliday.displayDate();

        Enemy newEnemy = new Enemy(70, 2.4f);
        newEnemy.attack();

        AirEnemy newAirEnemy = new AirEnemy(20, 5.2f);
        newAirEnemy.attack();

        FireEnemy newFireEnemy = new FireEnemy(60, 2.0f);
        newFireEnemy.attack();

        WaterEnemy newWaterEnemy = new WaterEnemy(40, 3.7f);
        newWaterEnemy.attack();
    }
}