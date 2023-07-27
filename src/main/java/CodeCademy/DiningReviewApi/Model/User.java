package CodeCademy.DiningReviewApi.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "utilizadores")
public class User {

    @Id
    @GeneratedValue
    private Long  Id;

    @Column(unique = true)
    @NotBlank(message = "Please insert your name")
    private String name;

    @NotBlank(message = "Insert the city you live in")
    private String city;

    @NotBlank(message = "Insert the state you live in")
    private String state;

    @NotBlank(message = "Insert your cities zipcode")
    private String zipcode;
    @NonNull
    private Boolean interestPeanut;
    @NonNull
    private Boolean interestEgg;
    @NonNull
    private Boolean interestDairy;

}
