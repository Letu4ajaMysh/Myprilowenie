package as.course.myprilowenie;

public class Game {
    private String name;
    private String description;
    private Integer id;


    public Game ( ) {
    }

    public Game ( String name , String description ) {
        this.name = name;
        this.description = description;
    }

    public Game ( String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }



    public Integer getId ( ) {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getDescription ( ) {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

}
