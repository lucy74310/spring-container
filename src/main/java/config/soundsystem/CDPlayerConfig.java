package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

@Configuration
//@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem", "com.cafe24.springcontainer.soundsystem."})
//basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package로 사용한다. (Marker Interface) 
@ComponentScan(basePackageClasses=Index.class)
public class CDPlayerConfig {
	//자동설정과 수동설정 같이 할 수 있다.
}
