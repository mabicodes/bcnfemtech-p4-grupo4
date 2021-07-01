package com.example.bcnfemtechp4grupo4.services;

import com.example.bcnfemtechp4grupo4.models.Platform;
import com.example.bcnfemtechp4grupo4.models.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlatformService {


    @Autowired
    private PlatformRepository platformRepository;

    public PlatformService(PlatformRepository platformRepository) {
        this.platformRepository = platformRepository;
    }

    public List<Platform> allPlatforms() {
        return (List<Platform>) platformRepository.findAll();
    }
}
