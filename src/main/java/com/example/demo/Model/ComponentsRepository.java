package com.example.demo.Model;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.Components;
import com.example.demo.Repo.Studentm;

@Component
public interface ComponentsRepository extends JpaRepository<Components, Serializable> {

}
