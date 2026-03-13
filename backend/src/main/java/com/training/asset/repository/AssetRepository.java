package com.training.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.asset.entity.Asset;

public interface AssetRepository
        extends JpaRepository<Asset, Long> {
}
