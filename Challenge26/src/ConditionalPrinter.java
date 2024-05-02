@FunctionalInterface
public interface ConditionalPrinter {

    void print(String param, boolean cond);
}

class Main {
    public static void main(String[] args) {

        ConditionalPrinter cd = (param, cond) -> {
            if (cond==true){
                System.out.println(param);
            }
        };
    }
}
