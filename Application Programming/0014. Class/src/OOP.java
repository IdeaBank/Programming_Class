public class OOP
{
    public static void main(String[] args)
    {
        Movie Clementine = new Movie("클레멘타인", 9.32, "김두영", 2004);
        System.out.println(Clementine.Explanation());
        System.out.println("현재 영화 개수 : " + Movie.MovieCount);
    }
}

class Movie
{
    Movie(String Name, double Rating, String Director, int PublishedYear)
    {
        MovieCount++;
        this.Name = Name;
        this.Rating = Rating;
        this.Director = Director;
        this.PublishedYear = PublishedYear;
    }

    public String Explanation()
    {
        return "이름 : " + this.Name + "\n평점 : " + this.Rating + "\n감독 : " + this.Director + "\n발표된 연도 : " + this.PublishedYear;
    }

    private String Name;
    private double Rating;
    private String Director;
    private int PublishedYear;

    static int MovieCount = 0;
}
