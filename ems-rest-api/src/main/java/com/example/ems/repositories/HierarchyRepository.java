package com.example.ems.repositories;

import com.example.ems.enitities.Hierarchy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HierarchyRepository  extends JpaRepository<Hierarchy,Long> {
}
