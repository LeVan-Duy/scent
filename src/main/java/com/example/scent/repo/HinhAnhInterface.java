package com.example.scent.repo;

import com.example.scent.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HinhAnhInterface extends JpaRepository<HinhAnh, Integer>{
}
