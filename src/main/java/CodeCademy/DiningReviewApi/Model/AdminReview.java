package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AdminReview {
    @Id
    @GeneratedValue
    private Long Id;

    private Boolean approval;
}
