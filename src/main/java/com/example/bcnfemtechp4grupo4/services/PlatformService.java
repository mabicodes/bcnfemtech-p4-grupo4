package com.example.bcnfemtechp4grupo4.services;

import com.example.bcnfemtechp4grupo4.models.Platform;
import java.util.*;

@Service
public class PlatformService {

    private PlatformRepository platformRepository;
    public List<Platform> allPlatforms() {
        return (List<Platform>) platformRepository.findAll();
    }
}
