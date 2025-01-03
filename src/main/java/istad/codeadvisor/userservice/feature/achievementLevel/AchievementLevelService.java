package istad.codeadvisor.userservice.feature.achievementLevel;

import istad.codeadvisor.userservice.domain.AchievementLevel;
import istad.codeadvisor.userservice.feature.achievementLevel.dto.AchievementLevelResponse;

public interface AchievementLevelService {

    String determineAchievementLevel(Integer totalPoints);

    // Get achievement level by user id
    AchievementLevelResponse getAchievementLevelById(String userId);

    int calculateTotalScore(AchievementLevel achievement);

    // handle the update from the content service
    void updateFromContentService(String userId, Integer shareContentTotal, Integer commentTotal, Integer likeTotal);
    // handle the update from the forum service
    void updateFromForumService(String userId, Integer askQuestionTotal, Integer answerQuestionTotal);
    // handle the update from the reaction service
    void updateFromCommunityService(String userId, String contentId, String reactionType);
    // handle the update from the comment service
    void updateCommentProducer(String userId, String contentId, String type);
    // handle the update from forum service
    void updateForumProducer(String userId, Integer askQuestionCount, Integer answerQuestionCount);
    // handle the update from the content service
    void updateContentProducer(String userId, String contentId, String type);
}
