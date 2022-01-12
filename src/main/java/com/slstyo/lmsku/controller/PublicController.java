package com.slstyo.lmsku.controller;

import com.slstyo.lmsku.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/course-dummies")
    public List<Course> getDummies(){
        Course dummy1 = new Course();
        dummy1.setId(UUID.randomUUID().toString());
        dummy1.setName(("Diklat PBJ"));

        Course dummy2 =
                Course.builder().name("Diklat Java").shortDescription("Deskitpi").build();

        List<Course> courseList = new ArrayList<>();
        courseList.add(dummy1);
        courseList.add(dummy2);

        return courseList;

    }
}
