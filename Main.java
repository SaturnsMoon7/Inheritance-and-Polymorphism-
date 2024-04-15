class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "hello";
        System.out.println(s.name);

        Student.study();

        StudentCouncilMember StuCo = new StudentCouncilMember();
        StuCo.attendMeeting();
        StuCo.study();


        Racecar newRacecar = new Racecar(200, "pink");
        newRacecar.getColour();



    }
}