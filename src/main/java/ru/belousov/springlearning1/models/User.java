package ru.belousov.springlearning1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "name") // ,nullable = false
    //@NonNull //можно уточнить @NonNullApi (область действия = параметры + возвращаемые значения) и / или @NonNullFields
    private String userName;

    @Column(name = "age")
    private int userAge;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "sex")
    private String userSex;

    //    private HashMap<String, String> usersex;
//
//    public HashMap<String, String> getUsersex() {
//        return usersex;
//    }
//
//    public void setUsersex(Map<String, String> usersex) {
//        this.usersex = usersex;
//    }
//    public User() {
//        getChangeSex = new HashMap<>();
//        getChangeSex.put("M", "Man");
//        getChangeSex.put("M", "Woman");
    public User() {
    }

    public User(String userName, int userAge, String userEmail, String userSex) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userSex = userSex;
    }

    public User(int userId, String userName, int userAge, String userEmail, String userSex) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userSex = userSex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userAge=").append(userAge);
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append(", userSex='").append(userSex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}