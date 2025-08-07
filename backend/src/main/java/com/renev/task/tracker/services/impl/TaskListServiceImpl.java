package com.renev.task.tracker.services.impl;

import com.renev.task.tracker.domain.entities.TaskList;
import com.renev.task.tracker.repositories.TaskListRepository;
import com.renev.task.tracker.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {
    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
