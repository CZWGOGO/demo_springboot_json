package com.example.demo_springboot_json.dao;

/**
 * Created by CZWGOGO on 2019/10/1 23:38
 */

import com.example.demo_springboot_json.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryDAO extends JpaRepository<Category,Integer>{

}