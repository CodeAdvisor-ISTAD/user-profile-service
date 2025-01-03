package istad.codeadvisor.userservice.config.kafka.producer;

import istad.codeadvisor.userservice.config.kafka.BaseProducer;
import lombok.Data;

@Data
public class ReactionProducer implements BaseProducer {
    private String userId;
    private String contentId;
    private String reactionType;
}
