package gunler.gun86_Pazartesi20;

import java.util.HashMap;
import java.util.Map;

public class Training3 {
    public static void main(String[] args) {


        Map<String,String>mapClass=new HashMap<>();
        mapClass.put("a","aaa");
        mapClass.put("c","ddd");



        if(mapClass.containsKey("a")&&!mapClass.containsKey("b")){

            mapClass.put("b",mapClass.get("a"));
        } else if (mapClass.containsKey("b")&&!mapClass.containsKey("a")) {
            mapClass.put("a",mapClass.get("b"));

        }
        System.out.println(mapClass);

    }
}