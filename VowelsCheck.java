public class VowelsCheck {
    public static void main(String[] args) {
        String name = "ranjitha";
        if (name != null && !name.isEmpty()) {
            char firstChar = Character.toLowerCase(name.charAt(0));
            if ("aeiou".indexOf(firstChar) != -1) {
                System.out.println("Starts with a vowel");
            } else {
                System.out.println("Does not start with a vowel");
            }
        } else {
            System.out.println("String is empty or null");
        }
    }
}
