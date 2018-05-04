package app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.*;

@ComponentScan(basePackages={"controller","biz","tool"})
@MapperScan(basePackages={"dao"})
@SpringBootApplication
public class RunStart extends SpringBootServletInitializer{
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RunStart.class);
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(RunStart.class, args);

	}

	@Bean
    public Converter<String, Date> addNewConvert() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 Date date = null;
            try {
                date = sdf.parse((String) source);
                } catch (Exception e) {
                e.printStackTrace();
                }
             return date;
            }
        };
    }
}
