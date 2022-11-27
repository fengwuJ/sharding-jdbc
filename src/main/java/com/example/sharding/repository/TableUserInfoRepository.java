package com.example.sharding.repository;

import com.example.sharding.entity.TableUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableUserInfoRepository extends JpaRepository<TableUserInfo, Long> {
}
