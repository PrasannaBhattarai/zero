package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

	@Query("SELECT s FROM Post s WHERE s.id=:id AND s.image=:name")
	List<Post> findByIdAndImage(@Param("id") int id, @Param("name") String name);

}
