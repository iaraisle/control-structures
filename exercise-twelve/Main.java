package ar.com.ada.online.second.exercisetwelve;

//12.Realice un algoritmo que permita determinar el sueldo semanal de un trabajador
// con base en las horas trabajadas y el pago por hora,considerando que a partir de la
// hora número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50,
// el triple, y que trabajar más de 50 horas no está permitido.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el salario semanal");

        double workedHours, hourlyWage, weeklySalary = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese cantidad de horas trabajadas esta semana: ");
        workedHours = keyboard.nextDouble();

        System.out.print("Ingrese el pago por hora: $");
        hourlyWage = keyboard.nextDouble();

        if (workedHours > 50) {
            System.out.println("No está permitido trabajar más de 50 horas, hable con un supervisor");
        } else if (workedHours <= 40) {
            weeklySalary = workedHours * hourlyWage;
        } else if (workedHours <= 45) {
            weeklySalary = (workedHours * hourlyWage) * 2;
        } else {
            weeklySalary = (workedHours * hourlyWage) * 3;
        }
        System.out.printf("El salario semanal es: $ %.2f" , weeklySalary);
    }
}
