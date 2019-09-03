package com.hms.crudJPA.Usercourses.repository;

import com.hms.crudJPA.Usercourses.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

}
