public class Season {
    public static enum Seasons {
        Winter(-10), Spring(3), Summer(24), Autumn(-3);
        private int avgTemperature;

        Seasons(int temperature)
        {
            this.avgTemperature = temperature;
        }

    }

    public static Seasons favourite = Seasons.Summer;

    public static void showFavourite()
    {
        System.out.println(favourite);
    }

    public static void showSeason(Seasons season)
    {
        System.out.println("Я люблю " + season);
    }

}
