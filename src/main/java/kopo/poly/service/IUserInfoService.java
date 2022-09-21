package kopo.poly.service;

import kopo.poly.dto.UserInfoDTO;

public interface IUserInfoService {

    // 회원 가입하기
    int insertUserInfo(UserInfoDTO pDTO) throws Exception;

    // 로그인을 위해 아이디와 비번이 일치하는지 확인하기
    int getUserLoginCheck(UserInfoDTO pDTO) throws Exception;
}
