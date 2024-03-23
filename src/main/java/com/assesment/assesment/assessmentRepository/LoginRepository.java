package com.assesment.assesment.assessmentRepository;

import com.assesment.assesment.assesmentModel.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer> {


}
