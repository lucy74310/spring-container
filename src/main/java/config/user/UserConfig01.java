package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User;

@Configuration
public class UserConfig01 {

	
	@Bean
	public User user() {
		return new User();
	}
}
