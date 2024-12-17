package net.janaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.janaguides.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}