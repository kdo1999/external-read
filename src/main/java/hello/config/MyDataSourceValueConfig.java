package hello.config;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.datasource.MyDataSource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MyDataSourceValueConfig {

	@Value("${my.datasource.url}")
	private String url;
	@Value("${my.datasource.username}")
	private String username;
	@Value("${my.datasource.password}")
	private String password;
	@Value("${my.datasource.etc.max-connection}")
	private int maxConnection;
	@Value("${my.datasource.etc.timeout}")
	private Duration timeout;
	@Value("${my.datasource.etc.options}")
	private List<String> options;

	@Bean
	public MyDataSource myDataSource1() {
		return new MyDataSource(url, username, password, maxConnection, timeout, options);
	}
}
