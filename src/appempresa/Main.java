package appempresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new Vendor("vendedor", "senha_vendedor"));
        users.add(new Customer("cliente", "senha_cliente"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome de usuário:");
            String username = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String password = scanner.nextLine();

            System.out.println("Escolha o tipo (vendedor ou cliente):");
            String type = scanner.nextLine();

            User user = authenticateUser(username, password, type, users);

            if (user != null) {
                if (user instanceof Vendor) {
                    System.out.println("Você está logado como vendedor. Página de anúncio de produtos do vendedor.");
                } else if (user instanceof Customer) {
                    System.out.println("Você está logado como cliente. Página de compras do cliente.");
                }
                break;
            } else {
                System.out.println("Nome de usuário ou senha incorretos ou tipo de usuário incorreto. Tente novamente.");
            }
        }
    }

    public static User authenticateUser(String username, String password, String type, List<User> users) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                if ((type.equals("vendedor") && user instanceof Vendor) ||
                    (type.equals("cliente") && user instanceof Customer)) {
                    return user;
                }
            }
        }
        return null;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Vendor extends User {
    public Vendor(String username, String password) {
        super(username, password);
    }
}

class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }
}
