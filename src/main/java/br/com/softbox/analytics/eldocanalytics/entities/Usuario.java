package br.com.softbox.analytics.eldocanalytics.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "usuario")
@NoArgsConstructor
public class Usuario {

    @Id
    private Long id;

    @Field("NOME_COMPLETO")
    private String nomeCompleto;

    @Indexed(unique = true)
    @Field("EMAIL")
    private String email;

    public Usuario(String nomeCompleto, String email) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
