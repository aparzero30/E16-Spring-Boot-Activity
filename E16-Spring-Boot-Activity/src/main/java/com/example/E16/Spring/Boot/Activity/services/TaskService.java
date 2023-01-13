package com.example.E16.Spring.Boot.Activity.services;

import com.example.E16.Spring.Boot.Activity.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.E16.Spring.Boot.Activity.entity.Task;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TaskRepository taskRepository;


    public String addTask(Task task){
        taskRepository.save(task);
        return "Task Added";
    }

    public  List<Task> getAllTask(){

        List<Task> tasks = taskRepository.findAll();
        return  tasks;
    }

 public Task findTask(String id){


     Long longId = Long.parseLong(id);
     Optional<Task> task = taskRepository.findById(longId);
     if(task.isPresent()) {
         return task.get();
     }
     else {
         throw new EntityNotFoundException("Task not found for the given id:"+id);
     }
 }

 public void deleteTask(Task task){

        taskRepository.delete(task);
 }








}
