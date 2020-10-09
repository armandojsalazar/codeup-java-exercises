package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String aName, String aCategory){
        this.name = aName;
        this.category = aCategory;
    }

    public String getMovieName(){
        return this.name.toLowerCase().trim();
    }

    public String getMovieCategory(){
        return this.category.toLowerCase().trim();
    }

    public void setMovieName(String name){
        this.name = name.toLowerCase().trim();
    }

    public void setMovieCategory(String category){
        this.category = category.toLowerCase().trim();
    }

}
