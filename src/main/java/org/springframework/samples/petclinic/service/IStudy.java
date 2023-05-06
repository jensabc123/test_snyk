package org.springframework.samples.petclinic.service;

import org.springframework.stereotype.Service;

@Service
public interface IStudy {
    public boolean isFinishedStudy(Integer score);
}
