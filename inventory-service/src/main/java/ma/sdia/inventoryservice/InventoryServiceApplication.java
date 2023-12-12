package ma.sdia.inventoryservice;

import ma.sdia.inventoryservice.entities.Product;
import ma.sdia.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            Random quantity = new Random();
            Random price = new Random();
            for (int i=1;i<=10;i++) {
                productRepository.save(Product.builder()
                        .id(UUID.randomUUID().toString())
                        .name("Product"+i)
                        .quantity(quantity.nextInt(11))
                        .price(price.nextInt(20)*1000)
                        .build());
            }
        };
    }

}
