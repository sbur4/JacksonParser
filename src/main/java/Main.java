import entity.Root;

public class Main {
    public static void main(String[] args) {
        SimpleParser parser = new SimpleParser();
        Root root = parser.parse();
        System.out.println(root.toString());
    }
}
