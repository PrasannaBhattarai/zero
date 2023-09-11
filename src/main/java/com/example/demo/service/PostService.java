package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	public List<Post> getAll() {
		List<Post> postList=repository.findAll();
		return postList;
	}
	
	public ResponseEntity<Post> getData(int id){
		Optional<Post> post= repository.findById(id);
		if(post.isPresent()) {
			return new ResponseEntity<Post>(post.get(),HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Post>(post.get(),HttpStatus.NOT_FOUND);
		}
	}
	
	public void createPost(Post post) {
		repository.save(post);
	}
	
	public String updatePost(int id,Post post) {
		Optional<Post> change = repository.findById(id);
		if(change.isPresent()) {
			Post ch= change.get();
			ch.setName(post.getName());
			ch.setDescription(post.getDescription());
			ch.setImage(post.getImage());
			repository.save(ch);
			return "done upd";
		}
		else {
			return "not done";
		}
	}

	public String deletePost(int id) {
		repository.deleteById(id);
		return "done";
	}
	
	public List<Post> findByIdAndImage(int id, String name) {
		List<Post> post= repository.findByIdAndImage(id,name);
		return post;
	}
	
}
