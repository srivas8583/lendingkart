package com.lendingkart.lending.kartController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/entity")
public class EntityController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getEntity(@PathVariable Long id) {
        return ResponseEntity.ok("GET request is successful for entity with id: " + id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> createEntity(@PathVariable Long id) {
        return ResponseEntity.ok("POST request is successful for entity with id: " + id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEntity(@PathVariable Long id) {
        return ResponseEntity.ok("PUT request is successful for entity with id: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEntity(@PathVariable Long id) {
        return ResponseEntity.ok("DELETE request is successful for entity with id: " + id);
    }
}
