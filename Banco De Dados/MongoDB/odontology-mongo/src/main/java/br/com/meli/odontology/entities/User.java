package br.com.meli.odontology.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "users")
@NoArgsConstructor
public class User {
    @Id
    private String idUser;
    private String userName;
    private String password;
    private String userStatus;

    public User(String userName, String password, String userStatus) {
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
    }
}
