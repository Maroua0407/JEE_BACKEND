package ma.enset.jee_backend.repositories;

import ma.enset.jee_backend.entities.BankAccount;
import ma.enset.jee_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
