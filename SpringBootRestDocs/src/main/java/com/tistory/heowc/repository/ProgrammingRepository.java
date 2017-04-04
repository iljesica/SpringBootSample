package com.tistory.heowc.repository;

import com.tistory.heowc.domain.Programming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingRepository extends JpaRepository<Programming, Long> {
}
