package lab3.repository;

import lab3.repository.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository
        extends MongoRepository<User, String>
{
    Optional<User> findByEmail( String email );
}
