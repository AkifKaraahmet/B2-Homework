import java.util.Arrays;
public class Ratings {
    private String[] runners;
    private final int[] times;

    public Ratings(String[] runners, int[] times) {
        this.runners = runners;
        this.times = times;
    }

    public void topThree() {
        int[] gridTime = Arrays.copyOf(times, times.length);
        Arrays.sort(gridTime);
        for (int i = 0; i < 3; i++) {
            int index = sortOf(times, gridTime[i]);
            if (i==0)
             System.out.println("Birinci = "+runners[index] + ": " + times[index]);
            else if (i==1)
                System.out.println("İkinci = "+  runners[index] + ": " + times[index]);
            else if (i==2)
                System.out.println("Üçüncü = " + runners[index] + ": " + times[index]);
        }
    }
    public void grading() {
        int A = 0;
        int B = 0;
        int C = 0;
        for (int time : times) {
            if (time >= 200 && time < 300)
                A++;
            else if (time >= 300 && time < 400)
                B++;
            else if (time >=400)
                C++;

        }
        System.out.println("A → "+A);
        System.out.println("B → "+B);
        System.out.println("C → "+C);
    }

    private int sortOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

