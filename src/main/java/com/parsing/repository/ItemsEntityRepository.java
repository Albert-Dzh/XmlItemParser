package com.parsing.repository;

import com.parsing.dto.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CourseEntityRepository - класс с базовыми методами
 *
 * @author max
 */
public interface ItemsEntityRepository extends JpaRepository<Item, Long> {
}
