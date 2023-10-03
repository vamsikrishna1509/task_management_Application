package com.vits.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    
}