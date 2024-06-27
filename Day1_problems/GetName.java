public class GetName {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the name");
        } else {
            String name = args[0];
            System.out.println("Name entered: " + name);
        }
    }
}

