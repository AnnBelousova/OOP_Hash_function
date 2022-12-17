package hashMapPhoneDictionary;

import java.util.HashMap;
import java.util.Map;

public class Phone {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Phone(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ", телефон: " + value;
    }
}
