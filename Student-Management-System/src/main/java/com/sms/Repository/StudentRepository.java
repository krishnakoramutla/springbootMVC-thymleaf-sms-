package com.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
