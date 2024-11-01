package culturemedia.repository;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import culturemedia.model.Video;
import culturemedia.repository.impl.VideoRepositoryImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VideoRepositoryTest {

    private VideoRepository videoRepository;

    @BeforeEach
    void init() {

        videoRepository = new VideoRepositoryImpl();

        List<Video> videos = List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1));


        for (Video video : videos) {
            videoRepository.save(video);
        }

    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() {
        assert (false);
    }

    @Test
    void
            when_FindAll_does_not_find_any_video_an_VideoNotFoundException_s

    hould_be_thrown_successfully() {
        assert (false);
    }

    @Test
    void when_FindByTitle_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        when(videoRepository.find("Inexistente")).thenReturn(Collections.emptyList());

        Executable executable = () -> culturemediaService.findByTitle("Inexistente");
        assertThrows(VideoNotFoundException.class, executable, "No videos found with title: Inexistente");
    }
    @Test
    void when_FindByDuration_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        when(videoRepository.find(6.0, 7.0)).thenReturn(Collections.emptyList());

        Executable executable = () -> culturemediaService.findByDuration(6.0, 7.0);
        assertThrows(VideoNotFoundException.class, executable, "No videos found with duration between 6.0 and 7.0");
    }
    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        when(videoRepository.findAll()).thenReturn(Collections.emptyList());

        Executable executable = () -> culturemediaService.findAll();
        assertThrows(VideoNotFoundException.class, executable, "No videos found.");
    }
}

