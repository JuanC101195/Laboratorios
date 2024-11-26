package culturemedia.service.Impl;

import culturemedia.model.Video;
import culturemedia.model.Views;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CulturemediaService;

import java.util.List;

public class CulturemediaServiceImpl implements CulturemediaService {

    private final VideoRepository videoRepository;

    public CulturemediaServiceImpl(VideoRepository videoRepository, ViewsRepository viewsRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public List<Video> findAll() {
        return List.of();  // Devuelve una lista vacía de videos
    }

    @Override
    public Video save(Video video) {
        System.out.println("Saving video: " + video);
        return video;  // Aquí se implementa la lógica real de guardado
    }

    @Override
    public Views save(Views view) {
        System.out.println("Saving view: " + view);
        return view;  // Implementa la lógica real de guardado para vista
    }

    @Override
    public List<Video> findByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Video> findByDuration(double minDuration, double maxDuration) {
        return List.of();
    }
}