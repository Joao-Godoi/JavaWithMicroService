package com.joaogodoi.hrworker.repositories;

import com.joaogodoi.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
