package com.parsing.repository;

import com.parsing.dto.Perk;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PerkEntityRepository extends JpaRepository<Perk, Long> {
}
