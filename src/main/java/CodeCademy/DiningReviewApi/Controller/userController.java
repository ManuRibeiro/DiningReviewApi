package CodeCademy.DiningReviewApi.Controller;

import CodeCademy.DiningReviewApi.Model.User;
import CodeCademy.DiningReviewApi.Repository.userRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
   @GetMapping("/allUsers")
    private Iterable<User> getAllUsers(){
        return this.userRepo.findAll();
    }

    @PutMapping("/editUser/{userName}")
    private User editUser(@RequestBody User userInput,@PathVariable(value = "userName") String name) {
        Optional<User> userToEdit = userRepo.findUsersByName(name);
        if (userToEdit.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        User updateduser = userToEdit.get();
        updateduser.setZipcode(userInput.getZipcode());
        updateduser.setState(userInput.getState());
        updateduser.setCity(userInput.getCity());
        updateduser.setInterestEgg(userInput.getInterestEgg());
        updateduser.setInterestDairy(userInput.getInterestDairy());
        updateduser.setInterestPeanut(userInput.getInterestPeanut());
        this.userRepo.save(updateduser);
        return updateduser;

    }
}
