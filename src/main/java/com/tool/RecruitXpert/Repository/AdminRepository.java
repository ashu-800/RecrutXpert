package com.tool.RecruitXpert.Repository;

import com.tool.RecruitXpert.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    boolean existsByEmail(String email);

    Optional<Admin> findByEmail(String email);

    boolean existsByOrganization(String organization);
}
