package com.olegyashcherov.Task_04;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";
    public static final String WEDNESDAY = "WEDNESDAY";
    public static final String THURSDAY = "BIRTHDAY";
    public static final String FRIDAY = "FRIDAY";
    public static final String SATURDAY = "SATURDAY";
    public static final String SUNDAY = "SUNDAY";

    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;

        Field[] fields = Main.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                if (!isValidField(field)) {
                    System.out.println("\nis not Valid Field!!!");
                    System.out.println("Name " + field.getName() + " and Value " + field.get(Main.class));
                    System.out.println("*****************************************************\n");
                }
            } catch (IllegalAccessException ignored) {

            }

        }

    }

    private static <T> boolean isValidField(Field field) throws IllegalAccessException {
        if (Modifier.isFinal(field.getModifiers())&&Modifier.isStatic(field.getModifiers())) {
            return field.getName().equals(field.get(Main.class));
        }
        return true;
    }
}
