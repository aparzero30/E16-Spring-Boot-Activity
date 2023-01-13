package com.example.E16.Spring.Boot.Activity.controller;


import com.example.E16.Spring.Boot.Activity.entity.Task;
import com.example.E16.Spring.Boot.Activity.services.TaskService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {


    private final TaskService taskService;

    public Controller(TaskService taskService) {
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
        taskService.addTask(task);
       return "task/addTaskPage";
   }


    @GetMapping("/allTasks")
    public String getAllTasks(Model model){
        model.addAttribute("tasks", taskService.getAllTask());
        return "task/allTaskPage";
    }

    @GetMapping ("/addSearhID")
    public String addSearchIDPage(Model model){
        return "task/addSearchIDPage";
    }


    @PostMapping("/searchToUpdate")
    public String searchToUpdate(@RequestParam("taskId") String taskId, Model model)  {
        // Do something with the inputString
        try{
            model.addAttribute("task",taskService.findTask(taskId));
        }
        catch (Exception e){
            return  "task/error";
        }



        return "task/updateTask";
    }


    @GetMapping ("/addSearchIDToDelete")
    public String addSearchIDDelete(Model model){
        return "task/searchIDDelete";
    }

    @PostMapping("/searchToDelete")
    public String searchToDelete(@RequestParam("taskId") String taskId, Model model)  {
        // Do something with the inputString

        try{
            model.addAttribute("task",taskService.findTask(taskId));
        }
        catch (Exception e){
            return  "task/error";
        }



        return "task/deleteTask";
    }


    @PostMapping("/delete")
    public String delete(@ModelAttribute Task task){
        taskService.deleteTask(task);
        return  "task/home";
    }



}
