package com.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.jpa.entities.Student;

public interface StudentRepo extends JpaRepository <Student, Long>
{

}
