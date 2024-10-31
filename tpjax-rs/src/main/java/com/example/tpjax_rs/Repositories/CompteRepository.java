package com.example.tpjax_rs.Repositories;

import com.example.tpjax_rs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompteRepository extends JpaRepository <Compte, Long> {
}
