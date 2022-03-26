import java.util.HashMap;
import java.util.Map;

public class GetSpecificFromSheet {

    static Map<String, String> attributes = new HashMap<>();

    public static String fetchTestDataFor(String keyName, String URL) {
        String responseBody = HttpHelper.makeGETRequest(URL);
        String configLines[] = responseBody.split("\\r?\\n");
        for (String p : configLines) {
            String[] key = p.split(",");
            key[0] = key[0].replace("\"", "");
            key[1] = key[1].replace("\"", "");
            attributes.put(key[0], key[1]);
        }
        return attributes.get(keyName);
    }

}
