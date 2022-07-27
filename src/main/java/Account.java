import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name != null && name.length() >= 3 && name.length() <= 19 ) {
            return Pattern.matches("^[A-Za-z0-9А-Яа-я0-9]+\\s{1}+[A-Za-z0-9А-Яа-я]+$", name);
        }
        return false;

    }

}
