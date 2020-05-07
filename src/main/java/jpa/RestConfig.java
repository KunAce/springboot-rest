package jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setDefaultPageSize(2)
                .setPageParamName("shpage")
                .setLimitParamName("shsize")
                .setSortParamName("shsort")
                .setBasePath("shapi")
                .setReturnBodyOnCreate(true)
                .setReturnBodyOnUpdate(true);
    }
}
