package org.springframework.samples.petclinic.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.samples.petclinic.model.User;

import java.util.List;


@Mapper
public interface UserMapper {
    public List<User> getUserList();
}
