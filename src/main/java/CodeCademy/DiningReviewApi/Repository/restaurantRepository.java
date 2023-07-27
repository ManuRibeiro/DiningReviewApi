package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface restaurantRepository extends CrudRepository <Restaurant,Long> {
}
