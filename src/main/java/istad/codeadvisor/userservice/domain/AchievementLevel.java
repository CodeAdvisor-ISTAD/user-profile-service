package istad.codeadvisor.userservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "achievement_levels")
public class AchievementLevel {
    @Id
    private Integer id;
    private Integer userId;
    private String currentLevel; // E.g., "Contributor"
    private Integer share_content_total;
    private Integer ask_question_total;
    private Integer answer_question_total;
    private Integer comment_total;
    private Integer interaction_total;
    private Boolean isPublish;
    private Boolean isDeleted;
}
