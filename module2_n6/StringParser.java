package module2_n6;

public class StringParser {

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (IllegalArgumentException e) {
            return false;
        }

    }

    public int parseInt(String s) throws IllegalArgumentException {

        if (s == null) {
            throw new IllegalArgumentException("Строка не должна быть null");
        }
        if (s.isBlank()) {
            throw new IllegalArgumentException("Строка не может быть пустой");
        }
        if (!isNumber(s)) {
            throw new IllegalArgumentException("Строка не является целочисленным числом");
        }
        return Integer.parseInt(s);
    }
}
