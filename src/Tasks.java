public enum Tasks {
    Hello("Hello World"),
    Handle_Input("Inmatningshantering"),
    Conditions("Villkor"),
    Convert_string_to_digit("Konvertera Sträng till Tal");

    private final String displayName;

    Tasks(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

