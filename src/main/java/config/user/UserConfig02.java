package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User1;


@Configuration
public class UserConfig02 {

	
	@Bean
	public User1 user() {
		return new User1();
	}
}
