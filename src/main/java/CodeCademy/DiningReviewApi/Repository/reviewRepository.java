package CodeCademy.DiningReviewApi.Repository;

import CodeCademy.DiningReviewApi.Model.DiningReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface reviewRepository extends CrudRepository<DiningReview,Long> {
}
