package org.springframework.samples.petclinic.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.samples.petclinic.model.Certificate;

@Mapper
public interface CET4Mapper {
    boolean getCertificate(int cet4Score);
}
