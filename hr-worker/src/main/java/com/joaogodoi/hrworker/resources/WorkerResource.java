package com.joaogodoi.hrworker.resources;

import com.joaogodoi.hrworker.entities.Worker;
import com.joaogodoi.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/worker")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> list() {
        List<Worker> allWorkers = workerRepository.findAll();
        return ResponseEntity.ok(allWorkers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getWorker(@PathVariable Long id) {
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
