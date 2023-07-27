package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reviewAdministrado")
public class AdminReview {
    @Id
    @GeneratedValue
    private Long Id;

    private Boolean approval;
}
