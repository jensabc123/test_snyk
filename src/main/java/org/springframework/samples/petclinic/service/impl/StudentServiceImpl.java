package org.springframework.samples.petclinic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.dao.mapper.CET4Mapper;
import org.springframework.samples.petclinic.dao.mapper.UserMapper;
import org.springframework.samples.petclinic.model.Certificate;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.service.IStudentService;
import org.springframework.samples.petclinic.service.IStudy;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudy studyImpl;
    @Autowired
    private CET4Mapper cET4Mapper;
    /**
     * 判断一个大学生能否毕业，score是平均分数，studyYears是学习年数
     */
    @Override
    public boolean isGraduated(Integer score, Integer studyYears) {
        if(score != null && studyYears != null){
            boolean isFinishedStudy = studyImpl.isFinishedStudy(score);
            
            //是否完成学习课程
            if(isFinishedStudy){
                //是否学习超过四年
                if(studyYears >= 4){
                    //是否获得英语4级证书
                    boolean isCertificate = cET4Mapper.getCertificate(80);
                    if(isCertificate)
                        return true;
                }
            }
        }
        return false;
    }
}
