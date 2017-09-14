package starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by homer on 17-9-5.
 */
@Configuration
@ConditionalOnClass(StorageService.class)
@EnableConfigurationProperties(StorageServiceProperties.class)
public class StorageAutoConfigure {
    @Autowired
    private StorageServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean(StorageService.class)
    @ConditionalOnProperty(prefix = "storage.service", value = "enabled", havingValue = "true")
    StorageService exampleService() {
        return new StorageService(properties);
    }
}
