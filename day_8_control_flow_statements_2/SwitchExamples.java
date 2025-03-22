package day_8_control_flow_statements_2;

public class SwitchExamples {

    public static void main(String[] args) {
        modernSwitchExample("snow");
        switchWithReturn("snow");
        multiCaseSwitch("lunch");
    }

    // 1️⃣ Modern Switch Kullanımı (Java 14+)
    public static void modernSwitchExample(String weather) {
        System.out.println("Modern Switch Example:");

        switch (weather) {
            case "sunny" -> {
                System.out.println("Go to park");
                System.out.println("Code Java");
            }
            case "hot" -> {
                System.out.println("Go swimming");
                System.out.println("Code Java");
            }
            case "windy" -> {
                System.out.println("Fly a kite");
                System.out.println("Code Java");
            }
            case "snow" -> {
                System.out.println("Go snowboarding");
                System.out.println("Code Java");
            }
            default -> System.out.println("Code Java in any other weather");
        }
        System.out.println();
    }

    // 2️⃣ Switch Expression ile Değer Döndürme
    public static void switchWithReturn(String weather) {
        System.out.println("Switch with Return:");

        String activity = switch (weather) {
            case "sunny" -> "Go to park and code Java";
            case "hot" -> "Go swimming and code Java";
            case "windy" -> "Fly a kite and code Java";
            case "snow" -> "Go snowboarding and code Java";
            default -> "Code Java in any other weather";
        };

        System.out.println(activity);
        System.out.println();
    }

    // 3️⃣ Çoklu Case Kullanımı
    public static void multiCaseSwitch(String mealType) {
        System.out.println("Multi Case Switch:");

        String meal = switch (mealType) {
            case "breakfast", "brunch" -> "Eat eggs and toast";
            case "lunch", "dinner" -> "Eat steak and salad";
            case "snack" -> "Eat fruit or nuts";
            default -> "Eat whatever you like";
        };

        System.out.println(meal);
        System.out.println();
    }
}
