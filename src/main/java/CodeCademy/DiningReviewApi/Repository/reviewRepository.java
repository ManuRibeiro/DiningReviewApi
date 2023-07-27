package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.DiningReview;
import org.springframework.data.repository.CrudRepository;

public interface reviewRepository extends CrudRepository<DiningReview,Long> {
}
