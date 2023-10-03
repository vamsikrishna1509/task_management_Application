                                                                                                                                                                                           package com.vits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.entity.Task;
import com.vits.service.TaskService;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
   @Autowired
   TaskService taskService;
private long id;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/task")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/task/{id}")
    public String deleteTaskById(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return "Deleted Successfully";
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() { 
        return (List<Task>) taskService.getAllTasks(); 
    }
    
}