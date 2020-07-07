package com.fjnu.fjnu.service;

import com.fjnu.fjnu.bean.User;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface IUserService {
    public void addUser(User user);
    public User login(User user);
    public List<User> getUsers();
    public  User getUserById(Integer id);
    public  int update(User user);
    public int delete(Integer id);
    public String readExcelFile(MultipartFile file);
}
