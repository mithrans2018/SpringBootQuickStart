package com.example.bein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bein.model.Topic;
import com.example.bein.service.TopicService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	@GetMapping("/api/topics")
	public List<Topic> getAllTopic(){
		return topicService.getAllTopics();
	}
	@GetMapping("/api/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id){
		return  topicService.getTopic(id);
	}
	
	@PostMapping("/api/topics")
    public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		
	}
	
	@PutMapping("/api/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topicService.updateTopic(id,topic);
		
	}
	@DeleteMapping("/api/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		  topicService.deleteTopic(id);
	}
}
