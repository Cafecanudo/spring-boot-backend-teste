package br.com.softbox.analytics.eldocanalytics.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "login")
@NoArgsConstructor
public class Login {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field("login")
    private String login;

    private Usuario usuario;

    public Login(String login, Usuario usuario) {
        this.login = login;
        this.usuario = usuario;
    }
}
