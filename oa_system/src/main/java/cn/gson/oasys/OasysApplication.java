package cn.gson.oasys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OasysApplication {

	public static void main(String[] args) {
		SpringApplication.run(OasysApplication.class, args);
		System.out.println("启动主页为: \r\n http://localhost:8088/logins   \r\n  账号密码为:  \r\n  soli / 123456");
	}
}

