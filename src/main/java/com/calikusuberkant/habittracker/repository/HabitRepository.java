package com.calikusuberkant.habittracker.repository;

import com.calikusuberkant.habittracker.models.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit,Integer> { }
