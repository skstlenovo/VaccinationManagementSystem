package com.example.vaccineManagementSystem.Repository;

import com.example.vaccineManagementSystem.Models.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Integer> {


}
