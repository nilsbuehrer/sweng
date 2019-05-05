package MensaVoter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class MenuManager {
    private Menu [] menus;
    public void loadMenus(String date) {
        try {
            Gson gson = new GsonBuilder().create();
            FileInputStream fis = new FileInputStream(date+".json");
            Reader reader = new InputStreamReader(fis, "UTF8");
            menus = gson.fromJson(reader, Menu[].class);
            reader.close();
            System.out.println("loaded "+menus.length+" menus");
        } catch (Exception e) {
            System.out.println("failed to load menus for "+date);
        }
    }

    public int getMenuCount() {
        return menus.length;
    }

    public Menu getMenu(int no) {
        return menus[no];
    }
}