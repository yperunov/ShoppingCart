package dev.ji.shoppingcart.config;

import dev.ji.shoppingcart.model.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class CartConfig {

    @Bean
    @SessionScope
    public Cart createCart() {
        return new Cart();
    }
}
