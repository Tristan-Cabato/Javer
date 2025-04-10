public class Guest extends Person {
    String guestID, email;

    public Guest() {
        super();
    }
    public Guest(String name, String contactNumber, int age, String guestID, String email) {
        super(name, contactNumber, age);
        this.guestID = guestID;
        this.email = email;
    }

    String formatting(String name) {
        String formatted = "";
        boolean capitalizeNext = true;
    
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
    
            if (c == ' ') {
                formatted += c;
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    formatted += Character.toUpperCase(c);
                    capitalizeNext = false;
                } else {
                    formatted += Character.toLowerCase(c);
                }
            }
        }
        return formatted;
    }

    String summary() {
        this.name = formatting(this.name);
        return """
                Name: %s
                Age: %d
                Contact Number: %s
                Guest ID: %s
                Email: %s
                """.formatted(name, age, contactNumber, guestID, email);
    }
}
