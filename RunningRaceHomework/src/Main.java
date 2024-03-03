//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] runners = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        Ratings rate = new Ratings(runners, times);
        rate.topThree();
        rate.grading();
    }
}
