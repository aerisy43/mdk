public class MySolution {
    public static void main()
    {
        Person obj1 = new Person();
        Person obj2 = new Person("John Doe", 46);

        obj1.move();
        obj2.talk();

        Season.showFavourite();
        Season.showSeason(Season.Seasons.Autumn);
    }
}
