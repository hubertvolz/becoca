package de.becoca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.relational.core.mapping.event.BeforeConvertCallback;

import java.util.UUID;

@Configuration
@EnableJdbcRepositories
public class JdbcConfig extends AbstractJdbcConfiguration {

    private static final Logger log = LoggerFactory.getLogger(JdbcConfig.class);

    @Bean
    BeforeConvertCallback<Customer> beforeSaveCallback() {
        return (employee) -> {
            if (employee.getId() == null) {
                employee.setId(UUID.randomUUID().toString());
                log.info("we got called to set an UUID");
            }
            return employee;
        };
    }
}
