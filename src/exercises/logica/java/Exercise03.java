package exercises.logica.java;

/*
Write an algorithm to determine the average consumption of a car,
given the distance traveled by the car and the total amount of used
 */
public class Exercise03 {
    public static void main(String[] args) {
        float km = 600;
        float gas = 45;

        float consMedio = km/gas;

        System.out.println("O consumo médio do carro é de: " + consMedio);
    }
}
