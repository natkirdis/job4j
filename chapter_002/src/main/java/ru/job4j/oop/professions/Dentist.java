package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    private boolean isAssistant;

    public boolean isAssistant() {
        return isAssistant;
    }

    public void setAssistant(boolean assistant) {
        isAssistant = assistant;
    }

    public static void pullTooth(Person person, Tooth tooth) {
    }

    public static void treatCaries(Person person, Tooth tooth) {
    }
}