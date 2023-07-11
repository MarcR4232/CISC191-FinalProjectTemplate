package edu.sdccd.cisc191.template;

import java.lang.reflect.Method;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import java.util.HashMap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle_PER_CLASS)


public class ServerTest {

    @Test
    public void testGetValueAtIndex() throws Exception{
        JFXPanel jfxPanel = new JFXPanel();
        Platform.runLater(() ->{
            try {
                Server server = new Server();
                server.start(new Stage());
                Method getValueatIndexMethod = Server.class.getDeclaredMethod(name:"GetValueAtIndex");
                getValueatIndexMethod.setAccessible(true);
                getValueatIndexMethod.invoke(server);
                assertEquals("Value at Index (0,0): 1", "Found Result");
            }
            catch
            (Exception e){
                e.printStackTrace();}
            }
        });
        Thread.sleep(1000);
    }

    @BeforeAll
public static void setup() {
        JFX Panel panel = new JFXPanel();
        Platform.runLater(() -> {
        });
    }
    @Test
public void testGetValueAtIndexGUI() throws Exception{
    JFXPanel jfxPanel = new JFXPanel();
    Platform.runLater(() ->{
        try{
            Server server = new Server();
            server.start(new Stage());
            Method getValueAtIndexGUIMethod = Server.class.getDeclaredMethod("Get ValueAtIndexGUI");
            getValueAtIndexGUIMethod.setAccessible(true);
            getValueAtIndexGUIMethod.invoke(server);
            assertEquals("The Value at Index (0, 0): 5");}
        catch (Exception e) {
            e.printStackTrace();
        }});
    Thread.sleep(1000);}

    @Test
public void testUserGetName(){
    User user = new User("Use1");
    assertEquals("use1", user.getName());}

    @Test
public void testScannerInput() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        assertEquals(1, value);
    }

    @Test
public void testHashMapPutandGet();
{
    HashMap<String, Integer> map = new HashMap<>();
    map.put("A",1);
    map.put("B",2);
    assertEquals(Integer.value0f(1), map.get("A"));
        assertEquals(Integer.value0f(2), map.get("B"));}
        @Test
public void testArraryListSize(){
        ArrayList<String> list=new Arraylist<>();
        list.add("Gluten");
        list.add("Lactose")
        list.add("Nuts")
        assertEquals(3,listsize());
        }
        }

    }
}
