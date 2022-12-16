package service.serviceimpl;
import enums.Gender;
import model.Book;
import model.User;
import service.UserService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    @Override
    public String createUser(List<User> users) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write is id: ");
        long id = scanner1.nextInt();
        System.out.println("Write is name:");
        String name = scanner.nextLine();
        System.out.println("Write is surname: ");
        String surname = scanner.nextLine();
        System.out.println("Write is emile: ");
        String emile = scanner.nextLine();
        System.out.println("Write is phoNumber:");
        String phoNumber = scanner.nextLine();
        System.out.println("Write is Gender:");
        System.out.println(Gender.valueOf(scanner1.nextLine()));
        System.out.println("Write is money: ");
        System.out.println(BigDecimal.valueOf(scanner.nextInt()));
        for (User s : users) {
            System.out.println(s);
        }
        User user = new User((int) id,name,surname,emile,phoNumber,Gender.valueOf(scanner.nextLine()),BigDecimal.valueOf(scanner.nextInt()));
        try {
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<User> findAllUsers() {

        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(Long id) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();


    }

    @Override
    public void groupUsersByGender() {
        try {
            groupUsersByGender();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
