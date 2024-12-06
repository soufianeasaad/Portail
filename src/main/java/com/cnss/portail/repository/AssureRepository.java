package com.cnss.portail.repository;

import com.cnss.portail.model.Assure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AssureRepository extends JpaRepository<Assure, Long> {

}
