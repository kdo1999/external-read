package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

import hello.config.MyDataSourceEnvConfig;
import hello.config.MyDataSourcePropertiesV1;
import hello.config.MyDataSourceValueConfig;
import hello.datasource.MyDataSourceConfigV1;
import hello.datasource.MyDataSourceConfigV3;

// @Import(MyDataSourceEnvConfig.class)
// @Import(MyDataSourceValueConfig.class)
// @Import(MyDataSourceConfigV1.class)
@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = {"hello.datasource", "hello.pay"})
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
