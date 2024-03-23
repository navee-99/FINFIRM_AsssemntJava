package com.assesment.assesment.assessmentService;

import com.assesment.assesment.assesmentException.AssessmentException;
import com.assesment.assesment.assesmentModel.LoginModel;
import com.assesment.assesment.assessmentRepository.LoginRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public String validatingUser(String password,Integer userId){
log.info(  "validatingUser");
        try {
            Optional<LoginModel> loginModel = loginRepository.findById(userId);

            if (loginModel.isEmpty()) {
                return "UserID is not valid";
            }
            LoginModel loginModelData = loginModel.get();

            if (!loginModelData.getPassword().equals(password)) {
                return "Password is not valid";
            }

            return "Login Success";
        }catch (AssessmentException assessmentException){
            throw new AssessmentException(assessmentException.getMessage());
        }
    }
}
