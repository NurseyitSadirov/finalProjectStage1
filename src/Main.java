import enums.Gender;
import model.User;
import service.serviceimpl.BookServiceImpl;
import service.serviceimpl.UserServiceImpl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Map<Integer,User> userMap = new HashMap<>();
        userMap.put(11,new User(1111,"Kurrtan","Erkinbaev","@gmail.com","+996990009302", Gender.valueOf(scanner.nextLine()), BigDecimal.valueOf(scanner.nextInt())));
        userMap.put(22,new User(1111,"Nurseyit","Sadirov","@gmail.com","+996990009302", Gender.valueOf(scanner.nextLine()), BigDecimal.valueOf(scanner.nextInt())));
        userMap.put(33,new User(1111,"Baiysh","Orozaliev","@gmail.com","+996990009302", Gender.valueOf(scanner.nextLine()), BigDecimal.valueOf(scanner.nextInt())));
        userMap.put(44,new User(1111,"Baytik","Taalaibekov","@gmail.com","+996990009302", Gender.valueOf(scanner.nextLine()), BigDecimal.valueOf(scanner.nextInt())));
        userMap.put(55,new User(1111,"Muhammed","Toichubai uulu","@gmail.com","+996990009302", Gender.valueOf(scanner.nextLine()), BigDecimal.valueOf(scanner.nextInt())));
        BookServiceImpl bookService = new BookServiceImpl();
        UserServiceImpl service = new UserServiceImpl();
        System.out.println(userMap);
        while (true){


         switch (scanner1.nextInt()){
             case 1:
                 break;
             case 2:
                 System.out.println(bookService.getAllBooks());
                 break;
             case 3:
                 break;
             case 4:
                 break;
             case 5:
                 break;
             case 6:
                 break;
             case 7:
                 break;
             case 8:
                 break;
             case 9:
                 break;
             case 10:
                 break;
         }

    }
}
}