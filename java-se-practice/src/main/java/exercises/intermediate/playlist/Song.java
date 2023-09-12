package exercises.intermediate.playlist;

public class Song {
    private String title;
    private double duration;
    public Song(String title, double duration){
        this.duration = duration;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return title +": "+duration;
    }
}
