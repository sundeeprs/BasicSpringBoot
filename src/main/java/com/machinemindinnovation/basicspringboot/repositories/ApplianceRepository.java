package com.machinemindinnovation.basicspringboot.repositories;

import com.machinemindinnovation.basicspringboot.entity.ApplianceEntity;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ApplianceRepository extends JpaRepository<ApplianceEntity, Integer> {
}
