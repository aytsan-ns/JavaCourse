class Example {
    public String publicField = "Public Data";
    String defaultField = "Default Data";
    protected String protectedField = "Protected Data";
    private String privateField = "Private Data";

    // Public метод для доступа к private полю
    public String getPrivateField() {
        return privateField;
    }
}

public class Task6_1 {
    public static void main(String[] args) {
        Example example = new Example();

        // Доступ к public полю
        System.out.println("Public: " + example.publicField);

        // Доступ к default полю
        System.out.println("Default: " + example.defaultField);

        // Доступ к protected полю
        System.out.println("Protected: " + example.protectedField);

        // Доступ к private полю невозможен
        // System.out.println("Private: " + example.privateField);

        // Доступ к private через public метод
        System.out.println("Private (via method): " + example.getPrivateField());
    }
}
