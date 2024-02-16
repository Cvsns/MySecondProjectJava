package Jeux;
import java.util.Scanner;
import java.util.Random;



public class JeuxJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 0;
        int max = 100;
        int nombreADeviner = random.nextInt(max - min + 1) + min;
        int tentative = 1;

        System.out.println("Devinez un nombre entre 0 et 100.");

        while (true) {
            System.out.print("Tentative #" + tentative + ": ");
            int proposition = scanner.nextInt();

            if (proposition < nombreADeviner) {
                System.out.println("Le nombre à deviner est plus grand.");
            } else if (proposition > nombreADeviner) {
                System.out.println("Le nombre à deviner est plus petit.");
            } else {
                System.out.println("Félicitations ! Vous avez deviné le nombre en " + tentative + " tentatives.");
                break;
            }

            tentative++;
        }

        scanner.close();
    }
}

