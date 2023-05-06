package org.springframework.samples.petclinic.service.impl;

import org.springframework.samples.petclinic.service.IStudy;
import org.springframework.stereotype.Service;

@Service
public class StudyImpl implements IStudy {
    public boolean isFinishedStudy(Integer score){
        if(score>80)
            return true;
        return false;
    }
}
