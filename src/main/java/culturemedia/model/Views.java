package culturoteca.model;

import java.time.LocalDateTime;

import culturemedia.model.Video;

public record View(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {
}
