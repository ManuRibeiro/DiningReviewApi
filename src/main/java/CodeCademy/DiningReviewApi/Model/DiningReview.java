package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "reviewDoRestaurante")
public class DiningReview {

    @Id
    @GeneratedValue
    private Long Id;

    @NotNull(message = "You must input a restaurant Id")
    private Long restaurantId;

    @Min(1)
    @Max(5)
    private Integer peanutScore;

    @Min(1)
    @Max(5)
    private Integer eggScore;

    @Min(1)
    @Max(5)
    private Integer dairyScore;

    private String commentary;

    private ReviewStatus status;


}
