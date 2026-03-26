abstract class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    public Media(String title, int duration, boolean isPremium) {
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public abstract void playContent();
}

class Movie extends Media {

    public Movie(String title, int duration, boolean isPremium) {
        super(title, duration, isPremium);
    }

    public void playContent() {
        if (isPremium) {
            System.out.println("Verifying Subscription...");
        }
        System.out.println("Streaming Movie: " + getTitle());
    }
}

class Podcast extends Media {

    public Podcast(String title, int duration) {
        super(title, duration, false);
    }

    public void playContent() {
        System.out.println("Loading Advertisement...");
        System.out.println("Playing Podcast: " + getTitle());
    }
}

public class global_streaming {

    public static void main(String[] args) {

        Media[] library = {
            new Movie("Inception", 148, true),
            new Podcast("Tech Talk", 30),
            new Movie("Free Guy", 115, false)
        };

        for (Media m : library) {
            m.playContent();
            System.out.println();
        }
    }

    
}