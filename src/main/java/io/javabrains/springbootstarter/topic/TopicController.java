package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","the spring framework","spring framework description"),
				new Topic("java","core java","Core java Description"),
				new Topic("JSON","JSON for dummies","JSON for dummies description")
				);
	}
}
