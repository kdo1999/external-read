package hello.config;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ConfigurationProperties("my.datasource")
@Getter
public class MyDataSourcePropertiesV1 {
	private String url;
	private String username;
	private String password;
	private Etc etc;

	@AllArgsConstructor(access = AccessLevel.PROTECTED)
	@Getter
	public static class Etc {
		private int maxConnection;
		private Duration timeout;
		private List<String> options = new ArrayList<>();
	}
}