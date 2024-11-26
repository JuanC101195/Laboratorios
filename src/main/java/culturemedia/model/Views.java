package culturemedia.model;

import java.time.LocalDateTime;

public record Views(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {
}
