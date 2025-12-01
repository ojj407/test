public class Main{
    public void main (String[] args) {
        Tier Katze = new Tier("Siam", "Mizi");
        Tier Vogel = new Tier("Pelikan", "Peli");

        System.out.println("Das Tier Katze: " + Katze);
 
        System.out.println("Vogel: " + Vogel.getArt() + Vogel.getName());
    }

}