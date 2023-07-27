package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface userRepository extends CrudRepository<User,Long> {
    Optional<User> findUsersByName(String name);
}
