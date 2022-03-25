package com.parsing.repository;

import com.parsing.dto.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemEntityRepository extends JpaRepository<Item, Long> {
}
