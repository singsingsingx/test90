package cn.wzzcd6.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching // 缓存
@EnableAsync // 异步
@EnableScheduling // task
@MapperScan("cn.wzzcd6.blog.mapper")
public class ServerBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerBlogApplication.class, args);
	}

}
