package az.iktlab.group_j4.java_lessons.lesson_8.warmup;

public class FactorialEx {

    public static int calcFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }

        return fact;
    }
}
