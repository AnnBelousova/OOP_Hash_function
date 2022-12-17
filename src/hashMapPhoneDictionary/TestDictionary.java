package hashMapPhoneDictionary;

public class TestDictionary {
    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.addToDictionary(new Phone("Ivanov", "+79158524545"));
        phoneList.addToDictionary(new Phone("Ivanov", "+79158524545"));
        phoneList.addToDictionary(new Phone("Petrov", "+7917895263"));
        phoneList.addToDictionary(new Phone("Sidorov", "+7204587845"));
        phoneList.addToDictionary(new Phone("Minin", "+7214568523"));
        phoneList.addToDictionary(new Phone("Sushkov", "+79284578956"));
        phoneList.addToDictionary(new Phone("Grigoryv", "+79851232020"));

        System.out.println(phoneList);
    }
}
