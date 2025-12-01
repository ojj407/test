public class Tier {
    private String art;
    private String name;

    public Tier (String art, String name) {
        this.art = art;
        this.name = name;
    }

    public String getArt() {
        return this.art;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.art + " " + this.name;
    }
}