package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long  Id;

    @Column(unique = true)@NotBlank(message = "Please insert your name")
    private String name;

    @NotBlank(message = "Insert the city you live in")
    private String city;

    @NotBlank(message = "Insert the state you live in")
    private String state;

    @NotBlank(message = "Insert your cities zipcode")
    private String zipcode;

    private Boolean interestPeanut;
    private Boolean interestEgg;
    private Boolean interestDairy;

}
