package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    Long Id;

    @NotBlank(message = "Insert the restaurant's name")
    private String name;

    @Min(1)@Max(5)
    private Integer peanutScore;

    @Min(1)@Max(5)
    private Integer eggScore;

    @Min(1)@Max(5)
    private Integer dairyScore;

    private Integer overAllScore;
}
