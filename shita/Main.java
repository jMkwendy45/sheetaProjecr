package shita;

import shita.controllers.UserController;
import shita.dto.request.RegisterUserRequest;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    import javax.swing.*;
@SpringBootApplication
public class Main {
    private static UserController userController = new UserController();

    public static void main(String... args) {
        SpringApplication.run(Main.class,args);
//        String mainMenu = """
//                Hi
//                what do you want to do?
//                1-> register new user
//                2--> find registered user
//                """;
//
//        int userInput = collectUserInput(mainMenu);
//        switch (userInput) {
//            case 1 -> registerUser();
//            case 2 -> findRegisteredUser();
//        }

    }
    private  static  void findRegisteredUser(){
        int userId = collectUserInput("Enter id");
        display(userController.findUserById(userId).toString());
        main();
    }

    public  static void registerUser(){
        String firstName = collectStringInput("Enter first name");
        String lastName = collectStringInput("enter last name");
        String address = collectStringInput("enter address");
        String email = collectStringInput("enter email");
        String phoneNumber = collectStringInput("enter phoneNumber");

        RegisterUserRequest request = new RegisterUserRequest();
        request.setAddress(address);
        request.setPhoneNumber(phoneNumber);
        request.setEmail(email);
        request.setFirstName(firstName);
        request.setLastName(lastName);
        display(userController.registerNewUser(request).toString());
        main();
}
private  static  void display(String prompt){
    JOptionPane.showMessageDialog(null,prompt);
}
    private  static  int collectUserInput(String mainMenu){
        return Integer.parseInt(JOptionPane.showInputDialog(mainMenu));
    }
    private  static  String collectStringInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
