package hashMapPhoneDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PhoneList {
    Phone phone;

    private Map<String, String> stringMap = new HashMap<>();

    public void addToDictionary(Phone phone) {
        stringMap.put(phone.getKey(), phone.getValue());
    }

    public PhoneList(Phone phone, Map<String, String> stringMap) {
        this.phone = phone;
        this.stringMap = stringMap;
    }

    public PhoneList() {
    }

    @Override
    public String toString() {
        return stringMap.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneList phoneList = (PhoneList) o;
        return Objects.equals(phone, phoneList.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }
}
