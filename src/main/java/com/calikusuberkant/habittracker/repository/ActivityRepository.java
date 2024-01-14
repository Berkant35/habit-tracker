package com.calikusuberkant.habittracker.repository;

import com.calikusuberkant.habittracker.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,Integer/*primary key*/> {

}
