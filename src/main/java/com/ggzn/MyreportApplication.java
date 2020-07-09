package com.ggzn;

import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import com.bstek.ureport.console.UReportServlet;

@ImportResource("classpath:ureport-console-context.xml")
@SpringBootApplication
@AutoConfigurationPackage
public class MyreportApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyreportApplication.class, args);
	}
	
	 /**注册 UReportServlet
     * @param  servlet
     * @param  urlMappings 值为“/ureport/*”的 urlMappings 是一定不能变的，否则系统将无法运行。
     */
	@Bean
	public ServletRegistrationBean<Servlet> ureportServlet(){
		ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
		return bean;
	}
}
