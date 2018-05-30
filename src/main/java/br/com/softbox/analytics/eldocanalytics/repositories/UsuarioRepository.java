package br.com.softbox.analytics.eldocanalytics.repositories;

import br.com.softbox.analytics.eldocanalytics.entities.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Login, String> {
}
