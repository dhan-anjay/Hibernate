package com.dhananjay.hibernate.repository;


import com.dhananjay.hibernate.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
