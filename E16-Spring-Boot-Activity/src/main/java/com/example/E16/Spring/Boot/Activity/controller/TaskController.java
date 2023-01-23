package com.example.E16.Spring.Boot.Activity.controller;


import com.example.E16.Spring.Boot.Activity.entity.Task;
import com.example.E16.Spring.Boot.Activity.services.TaskService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping
public class TaskController {


    private final TaskService taskService;



    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("home")
    public String goToHome(){

        return  "task/home";
    }
    @GetMapping ("addTaskPage")
    public String addTaskPage(Model model){
        return "task/addTaskPage";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute Task task){




        if(task.getTitle().isEmpty() || task.getDescription().isEmpty() || task.getCompleted().isEmpty()){
            return "task/addTaskPage";
        }

        taskService.addTask(task);

        return "task/addTaskPage";
    }


    @GetMapping("/allTasks")
    public String getAllTasks(Model model){
        model.addAttribute("tasks", taskService.getAllTask());
        return "task/allTaskPage";
    }















    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("submitButton") String submitButton, @ModelAttribute Task task, Model model) {








        if (submitButton.equals("update")) {


            try {
                taskService.findTask(String.valueOf(task.getTaskId()));
                taskService.addTask(task);

            }
            catch (Exception e){
                model.addAttribute("tasks", taskService.getAllTask());
                return "task/allTaskPage";
            }






        } else {
            taskService.deleteTask(task);
        }


        model.addAttribute("tasks", taskService.getAllTask());
        return "task/allTaskPage";
    }









}