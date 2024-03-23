package com.assesment.assesment.assesmentController;
import com.assesment.assesment.assesmentException.AssessmentException;
import com.assesment.assesment.assessmentService.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LoginController {

@Autowired
LoginService loginService;
    @GetMapping("/login")
    public ResponseEntity<String> addUsers(@RequestParam(name = "userId") Integer userId,
                                           @RequestParam(name = "password") String password) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(loginService.validatingUser(password, userId));
        }catch (AssessmentException assessmentException){
            throw new AssessmentException(assessmentException.getMessage());
        }
    }
}
