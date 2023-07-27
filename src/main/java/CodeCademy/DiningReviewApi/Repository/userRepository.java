package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User,Long> {
}
