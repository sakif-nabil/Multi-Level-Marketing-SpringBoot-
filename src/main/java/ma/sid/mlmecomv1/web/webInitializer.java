package ma.sid.mlmecomv1.web;

import ma.sid.mlmecomv1.MlmEcomV1Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class webInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MlmEcomV1Application.class);
    }
}
