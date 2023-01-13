package com.example.E16.Spring.Boot.Activity.repository;

import com.example.E16.Spring.Boot.Activity.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
