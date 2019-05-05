package MensaVoter;

import java.util.ArrayList;

public class Menu {
    private String type;
    private String title;
    private String description;
    private double [] prices;
    private int likes = 0;
    private ArrayList<String> comments = new ArrayList<>();

    public Menu() {
    }

    public Menu(String type, String title, String description) {
        this.type = type;
        this.title = title;
        this.description = description;
        prices = new double[3];
    }

    public void setPrice(double stud, double intern, double extern) {
        prices[0] = stud;
        prices[1] = intern;
        prices[2] = extern;
    }

    public void printMenu() {
        System.out.println("\nTyp: " + type);
        System.out.println("Titel: " + title);
        System.out.println("Beschreibung: " + description);
        System.out.println("Preise: " + prices[0] + " STUD, " + prices[1] + " INT, " + prices[2] + " EXT");
    }

    public void like() {
        likes++;
    }

    public int getLikes() {
        return likes;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String getComments() {
        String formattedComments = "";
        for (String c : comments) {
            formattedComments+= "-" + c + "<br>";
        }
        return formattedComments;
    }
}
