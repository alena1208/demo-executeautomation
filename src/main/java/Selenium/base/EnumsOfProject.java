package Selenium.base;

public class EnumsOfProject {
    //Enum for Title
    public enum Title{
        MR("Mr."),
        MS("Ms.");

        public String text;
        Title(String text) { this.text = text;}
    }

    //Enum for Gender
    public enum Gender{
        MALE("Male"),
        FEMALE("Female");

        public String text;
        Gender(String text) { this.text = text;}
    }

    //Enum for Language
    public enum Language{
        MALE("English"),
        FEMALE("Hindi");

        public String text;
        Language(String text) { this.text = text;}
    }

}
