package com.greenenergy.solarsolutions.controller;

import com.greenenergy.solarsolutions.dto.EstimatorRequestDTO;
import com.greenenergy.solarsolutions.dto.EstimatorResponseDTO;
import com.greenenergy.solarsolutions.service.EstimatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estimate")
@CrossOrigin(origins = "*")
public class EstimatorController {

    private final EstimatorService estimatorService;

    public EstimatorController(EstimatorService estimatorService) {
        this.estimatorService = estimatorService;
    }

    @PostMapping
    public EstimatorResponseDTO estimate(@RequestBody EstimatorRequestDTO request) {
        return estimatorService.calculateEstimate(request);
    }
}
