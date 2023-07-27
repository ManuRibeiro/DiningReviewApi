package CodeCademy.DiningReviewApi.Controller;

import CodeCademy.DiningReviewApi.Model.User;
import CodeCademy.DiningReviewApi.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Users")
public class userController {

    final userRepository userRepo;

    public userController(userRepository userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/create")
    private String createNewUser(@RequestBody User user){
       //first check if the display name already exists, if not create the user otherwise dont
       Optional<User> existingDisplayName = this.userRepo.findUsersByName(user.getName());
       if(existingDisplayName.isPresent()){
           return "This userName already exists, chose another one";
       }
       User newUser = user;
       this.userRepo.save(newUser);
       return "User created Successfuly!";
   }

}
