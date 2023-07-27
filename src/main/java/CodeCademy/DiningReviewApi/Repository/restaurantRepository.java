package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface restaurantRepository extends CrudRepository <Restaurant,Long> {
}
