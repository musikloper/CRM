package com.project.crm.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	List<UserVO> selectUserList();

	int selectUSER_CMP(Map<String, String> map);

	UserVO selectUSER_INFO(String user_id);
}