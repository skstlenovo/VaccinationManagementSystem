package com.example.vaccineManagementSystem.Service;

import com.example.vaccineManagementSystem.Models.Dose;
import com.example.vaccineManagementSystem.Models.User;
import com.example.vaccineManagementSystem.Repository.DoseRepository;
import com.example.vaccineManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    @Autowired
    UserRepository userRepository;

    public String giveDose(String doseId, Integer userId)
    {
        User user=userRepository.findById(userId).get();

        // An entity of that model is created
        //This entity will save in database
        Dose dose=new Dose();

        //Setting its attributes
        dose.setDoseId(doseId);
        dose.setUser(user);
        //setting the child object in that corresponding
        user.setDose(dose);

        // Save the entity
        userRepository.save(user);
        //child will automatically get saved due to cascading effect
        return "Dose Given to User successfully";

    }
}
