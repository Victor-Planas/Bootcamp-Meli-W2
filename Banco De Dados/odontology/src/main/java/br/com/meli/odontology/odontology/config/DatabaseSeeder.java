package br.com.meli.odontology.odontology.config;

import br.com.meli.odontology.odontology.repositories.DentistRepository;
import br.com.meli.odontology.odontology.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.LocalDate;


@Component
public class DatabaseSeeder implements ApplicationRunner {


    private final DentistRepository dentistRepository;
    private final PatientRepository repository;
    private final DataSource dataSource;

    @Autowired
    public DatabaseSeeder(DentistRepository dentistRepository,
                          PatientRepository repository,
                          DataSource dataSource) {
        this.dentistRepository = dentistRepository;
        this.repository = repository;
        this.dataSource = dataSource;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (dentistRepository.count() > 0) {
            return;
        }
        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator(
                false,
                false,
                "UTF-8",
                new ClassPathResource("initialData.sql")
        );
        resourceDatabasePopulator.execute(dataSource);


    }


}

