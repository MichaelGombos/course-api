package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
		@Autowired
		private TopicRepository topicRepository;
	
		List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring","the spring framework","spring framework description"),
				new Topic("java","core java","Core java Description"),
				new Topic("JSON","JSON for dummies","JSON for dummies description")
				));
		
		public List<Topic> getAllTopics() {
			List<Topic> topics = new ArrayList<>();
			topicRepository.findAll()
			.forEach(topics::add); 
			//each element in iterable, add topic. 
			//method reference
			return topics;
		}
		
		public Topic getTopic(String id) {
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

		public void addTopic(Topic topic) {
			topicRepository.save(topic);
			//saved to db
		}

		public void updateTopic(String id, Topic topic) {
			for(int i = 0; i < topics.size(); i++) {
				Topic t = topics.get(i);
				if (t.getId().equals(id)) {
					topics.set(i, topic);
					return;
				}
			}
			
		}

		public void deleteTopic(String id) {
			topics.removeIf(t -> t.getId().equals(id));
			
		}
}
