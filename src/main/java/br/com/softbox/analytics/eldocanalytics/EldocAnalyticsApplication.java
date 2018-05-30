package br.com.softbox.analytics.eldocanalytics;

import br.com.softbox.analytics.eldocanalytics.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class EldocAnalyticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EldocAnalyticsApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UsuarioRepository usuarioRepository) {
        return args -> {
//            usuarioRepository.save(new Login("qeq23", "Wellton", Calendar.getInstance().getTime()));
//            System.out.println(usuarioRepository.findAll().size());
//            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            //Optional<Login> use = usuarioRepository.findById(2L);


            //System.out.println(use.get().getNome());

            /*Domain obj = domainRepository.findOne(7L);
            System.out.println(obj);

            Domain obj2 = domainRepository.findFirstByDomain("mkyong.com");
            System.out.println(obj2);

            int n = domainRepository.updateDomain("mkyong.com", true);
            System.out.println("Number of records updated : " + n);*/

        };

    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext mongoMappingContext) {
        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), mongoMappingContext);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
        return mongoTemplate;
    }
}
