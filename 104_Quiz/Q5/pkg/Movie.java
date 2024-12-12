package pkg;

public class Movie{

String moviename;
double rating; 
int numberratings;
int revenue;

public Movie() {
    moviename = "Avengers";
    rating = 8.0;
    numberratings = 33;
    revenue = 623357910; 
}


public Movie(String a, double b, int c, int d){
    moviename = a;
    rating = b;
    numberratings = c; 
    revenue = d; 
    
}

public void movieToString() {
    System.out.println("Movie name: " +moviename);
    System.out.println("Rating: " + rating);
    System.out.println("Number of ratings " + numberratings);
    System.out.println("Revenue: " + revenue);
    System.out.println();
}

public String getMovieName() {
    return moviename;
}
public int getRevenue() {
    return revenue;
}
public double getRating() {
    return rating; 
}

public void addRating(double c) {
    double z;
    z = rating * numberratings;
    rating = (z + c)/(numberratings + rating);  

}


public compareRatings(Movie a){
    Movie b = new Movie();
    double num1 = a.getRating();
    double num2 = b.getRating();
    if (nu2>num1) {
        return true;
    }
    else {
        return false; 
    }


}
}