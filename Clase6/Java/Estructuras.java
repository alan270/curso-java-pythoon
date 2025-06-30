import java.util.*;

public class Estructuras {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Luis");
        persona.put("edad", "treinta");

        System.out.println(persona.get("nombre"));
        //persona.put("edad", 31);

        for (Map.Entry<String, Object> entry : persona.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}