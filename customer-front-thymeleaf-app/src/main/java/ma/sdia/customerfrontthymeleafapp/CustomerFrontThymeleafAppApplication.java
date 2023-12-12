package ma.sdia.customerfrontthymeleafapp;

import ma.sdia.customerfrontthymeleafapp.entities.Customer;
import ma.sdia.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            for (int i=1;i<=10;i++){
                customerRepository.save(Customer.builder().name("Name"+i).email("name"+i+"@gmail.com").build());
            }
        };
    }

}
