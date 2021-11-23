package com.example.demo.Model;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.Studentm;
import com.example.demo.Repo.Template;

@Component
public interface TemplateRepository extends JpaRepository<Template, Serializable>{ 

}
