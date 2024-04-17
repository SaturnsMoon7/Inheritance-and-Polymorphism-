
class Main
{
    public static void main(String[] args)
    {
        // PRACTICE #1
        System.out.println("#1");
        Student newStudent = new Student("Jack", 17);
        Student.study();

        StudentCouncilMember newStudentCouncilMember = new StudentCouncilMember("Jill", 16);
        newStudentCouncilMember.attendMeeting();
        newStudentCouncilMember.study();



        // PRACTICE #2
        System.out.println("#2");
        Car newCar = new Car("Yellow");
        System.out.println(newCar.getColour());

        Racecar newRacecar = new Racecar(200, "pink");
        System.out.println(newRacecar.getColour());



        // PRACTICE #3
        System.out.println("#3");
        Window newWindow = new Window(10, 5);
        newWindow.toggleWindow();

        StainedGlassWindow newStainedWindow = new StainedGlassWindow(2, 4, "Red");
        newStainedWindow.displayWindowType();
        newStainedWindow.toggleWindow();

        ThreePanedWindow newPainedWindow = new ThreePanedWindow(4, 6, 10);
        newPainedWindow.displayWindowType();
        newStainedWindow.toggleWindow();



        // PRACTICE #4
        System.out.println("#4");
        Date newDate = new Date(2006, 4, 12);
        newDate.displayDate();

        Holiday newHoliday = new Holiday(0, 12, 25, "Christmas");
        System.out.println("The holiday is: " + newHoliday.getTitle());
        newHoliday.displayDate();



        // PRACTICE #5
        System.out.println("#5");
        Enemy newEnemy = new Enemy(70, 2.4f);
        newEnemy.attack();

        AirEnemy newAirEnemy = new AirEnemy(20, 5.2f);
        newAirEnemy.attack();

        FireEnemy newFireEnemy = new FireEnemy(60, 2.0f);
        newFireEnemy.attack();

        WaterEnemy newWaterEnemy = new WaterEnemy(40, 3.7f);
        newWaterEnemy.attack();



        // PRACTICE #7
        System.out.println("#4");
        BankAccount newBankAccount = new BankAccount(90);
        newBankAccount.deposit(40);
        newBankAccount.withdraw(30);
        System.out.println("Balance: " + newBankAccount.getBalance());

        SavingsAccount newSavingsAccount = new SavingsAccount(120);
        newSavingsAccount.withdraw(30);
        System.out.println("Balance: " + newSavingsAccount.getBalance());



        // PRACTICE #7
        System.out.println("#4");
        Quest newQuest = new Quest("Water plants", "Blacksmith's garden", "1500 coins", Priority.Low, Difficulty.Beginner);
        newQuest.display();

        FightingQuest newFight = new FightingQuest("Guardian of Eldor", "Brick Castle", "Diamond Sword", Priority.High, Difficulty.Nightmare, 150);
        newFight.display();
    }
}