package com.kijak.kijak.DAO;

import com.kijak.kijak.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementDAO extends JpaRepository<Choice, Long> {
}