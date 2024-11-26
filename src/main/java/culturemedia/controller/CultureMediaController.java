package culturemedia.controller;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;

import culturemedia.service.Impl.CulturemediaServiceImpl;
import culturemedia.model.Video;
public class CultureMediaController {

    private final CulturemediaServiceImpl cultureMediaService;


    public CultureMediaController(CulturemediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> find_allVideos() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }


}