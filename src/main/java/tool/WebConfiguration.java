package tool;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }
     
    @Bean
    public FilterRegistrationBean testFilterRegistration() {
    	//配置过滤器
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new FirstFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("test", "testval");
        registration.setName("FirstFilter");
        registration.setOrder(1);
        return registration;
    }
}