package io.springbootstarter.topic;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spring","Spring Framework","Spring framework description"),
				new Topic("docker","Docker","Docker description"),
				new Topic("k8s","Kubernetes","description")
				);

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
}
