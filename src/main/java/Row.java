import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Row implements Serializable {

    private Map<String, String> valueMap = new HashMap<>();

    Row() {}

    Row(List<String> headers){
        for (String header : headers) {
            valueMap.put(header, "");
        }
    }

    Row(String[] headers, String[] values){
        throw new IllegalStateException();
    }

    void setValue(String header, String value) {
        valueMap.put(header, value);
    }

    void removeValue(String header) {
        valueMap.remove(header);
    }

    String getValue(String header) {
        return valueMap.get(header);
    }

    boolean containsHeader(String header) {
        return valueMap.containsKey(header);
    }

}
