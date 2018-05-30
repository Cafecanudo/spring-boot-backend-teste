package br.com.softbox.analytics.eldocanalytics.resources;

import br.com.softbox.analytics.eldocanalytics.entities.Usuario;
import br.com.softbox.analytics.eldocanalytics.entities.Login;
import br.com.softbox.analytics.eldocanalytics.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Login findAll(){
        Login login = new Login("cafecanudo", new Usuario("WELLTON S BARROS", "cafecanudo@gmail.com"));
        return usuarioRepository.save(login);
    }
}
