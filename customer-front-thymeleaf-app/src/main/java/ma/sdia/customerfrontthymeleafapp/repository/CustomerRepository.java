package ma.sdia.customerfrontthymeleafapp.repository;


import ma.sdia.customerfrontthymeleafapp.entities.Customer ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
