package culturemedia.repository;

import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Views;
public interface CulturemediaService {
    List<Video> findAll();
    Video save(Video save);
    Views save(Views save);

}