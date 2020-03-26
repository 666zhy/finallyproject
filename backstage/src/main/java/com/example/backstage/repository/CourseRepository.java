package com.example.backstage.repository;

import com.example.backstage.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseRepository extends BaseReporsitory<Course , Integer> {
    /**
     * 根据课程id 查询课程
     * @param cid
     * @return
     */

    @Query("from Course c where c.id=:cid")
    Course find(@Param("cid")Integer cid);
}