package com.vits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.entity.Task;
import com.vits.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
    private static TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public  Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    public static void deleteTask(long id) {
        taskRepository.deleteById(id);
    }

	public void deleteById(Long id) {
		
		
	}

	public Object findById(Integer id) {
		
		return null;
	}

	public List<Task> findAllTasks() {
		
		return null;
	}
}