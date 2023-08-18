import java.time.LocalDate;
import java.time.LocalDateTime;

class User {
    String userName;
    String password;
    long mobileNumber;
    boolean isActive;
    String gender;
    LocalDate createdDate;

    User() {}

    User(String userName, String password, long mobileNumber, boolean isActive, String gender, LocalDate createdDate) {
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.isActive = isActive;
        this.gender = gender;
        this.createdDate = createdDate;
    }

    void printUser() {
        System.out.println("User Name: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Active Status: " + isActive);
        System.out.println("Gender: " + gender);
        System.out.println("Date: " + createdDate);
    }
}

class StandardUser extends User {
    String alias;
    LocalDateTime lastLogin;
    String role;

    StandardUser() {}

    StandardUser(String userName, String password, long mobileNumber, boolean isActive, String gender, LocalDate createdDate, String alias, LocalDateTime lastLogin, String role) {
        super(userName, password, mobileNumber, isActive, gender, createdDate);
        this.alias = alias;
        this.lastLogin = lastLogin;
        this.role = role;
    }

    @Override
    void printUser() {
        super.printUser();
        System.out.println("Alias: " + alias);
        System.out.println("Last login Time: " + lastLogin);
        System.out.println("Role: " + role);
    }
}

class CustomUser extends User {
    String emailId;
    long securityKey;
    User manager;

    CustomUser() {}

    CustomUser(String userName, String password, long mobileNumber, boolean isActive, String gender, LocalDate createdDate, String emailId, long securityKey, User manager) {
        super(userName, password, mobileNumber, isActive, gender, createdDate);
        this.emailId = emailId;
        this.securityKey = securityKey;
        this.manager = manager;
    }

    @Override
    void printUser() {
        super.printUser();
        System.out.println("Email ID: " + emailId);
        System.out.println("Security Key: " + securityKey);
        System.out.println("Manager: " + manager.userName);
    }
}

public class Main {
    public static void main(String[] args) {
        User users[] = new User[3];
        users[0] = new StandardUser("Ayush", "stdayush@123", 9685746352L, true, "Male",
                LocalDate.of(2000, 5, 6), "Alias1", LocalDateTime.of(2023, 12, 25, 0, 0), "Role1");

        users[1] = new CustomUser("ABC", "passisjava", 7896545686L, true, "Male",
                LocalDate.of(1999, 1, 4), "@gmail.com", 123456, users[0]);

        for (User user : users) {
            if (user instanceof StandardUser && user.gender.equals("Female")) {
                user.printUser();
                System.out.println();
            }
        }

        for (User user : users) {
            if (user instanceof CustomUser && user.createdDate.isBefore(LocalDate.of(2000, 1, 1))
                    && ((CustomUser) user).emailId.contains("gmail.com")) {
                user.printUser();
                System.out.println();
            }
        }
    }
}
