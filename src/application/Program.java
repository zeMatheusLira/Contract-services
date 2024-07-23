package application;

import entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número:");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy):");
        Date date = sdf.parse(sc.next());
        System.out.print("Valor do contrato:");
        double valueTotal = sc.nextDouble();
        System.out.print("Entre com o número de parcelas:");
        int installments = sc.nextInt();

        Contract contracts = new Contract(number, date, valueTotal, new Contract( ));
        // sei que tem um erro, vou dormir e amanhã tento resolver -> multiplicação do installment * parcelas(talvez isso seja um caminho)
        // provavelmente installments nao recebe como atributo contracts
        // processContract que deve fazer a multiplicacao para as parcelas -> arrumar um jeito de somar o mes
        // for seria uma ideia interessante para o proncessContract?

        System.out.println("Parcelas:");


        sc.close();
    }
}
