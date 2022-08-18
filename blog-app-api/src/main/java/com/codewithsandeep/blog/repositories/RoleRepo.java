package com.codewithsandeep.blog.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsandeep.blog.entities.Role;



public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
