package MensaVoter;

public class Main {

    public static void main(String[] args) {
        MenuManager mm = new MenuManager();
        mm.loadMenus("20181120");
        mm.getMenu(0).like();
        mm.getMenu(1).like();
        mm.getMenu(1).like();
        System.out.println(mm.getMenu(0).getLikes());
        System.out.println(mm.getMenu(1).getLikes());
        mm.getMenu(0).addComment("Chicken wie Schuhsohle");
        mm.getMenu(0).addComment("Auch Trockenreis braucht Wasser!!");
        System.out.println(mm.getMenu(0).getComments());
    }

}