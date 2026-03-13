package com.training.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.training.asset.entity.Asset;
import com.training.asset.repository.AssetRepository;

@RestController
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    AssetRepository repository;

    @GetMapping
    public List<Asset> list() {
        return repository.findAll();
    }
}
