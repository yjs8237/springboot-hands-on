package kr.co.fastcampuse.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login/login");
        registry.addViewController("/board/list").setViewName("board/list");
        registry.addViewController("/board/create").setViewName("board/create");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
