package ru.teamscore.java23.divbyzero;

public class DivMain {
    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("123");
            int b = Integer.parseInt("0");
            System.out.println(div(a, b));
        } catch (NumberFormatException ex) {
            System.err.println("Значение не может быть преобразовано в число: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.err.println("Ошибка при выполнении расчета: " + ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
