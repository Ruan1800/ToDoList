package com.ToDoList.ToDoList.Controller;

import Model.Task;
import Repository.TaskRepository;
import com.ToDoList.ToDoList.DTO.TaskDto;
import com.ToDoList.ToDoList.Service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/to-do-list")
public class TaskController {

  public final TaskService taskService;


   public TaskController(TaskService taskService) {
   this.taskService =taskService;
   }

   @PostMapping("/adicionar")
   @ResponseStatus(HttpStatus.CREATED)
    public void adicionarTask(@RequestBody Task task) {
    taskService.adicionarTask(task);



 }



}
