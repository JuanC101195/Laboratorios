package culturemedia.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import culturemedia.model.Views;
import culturemedia.repository.ViewsRepository;

public class ViewsRepositoryImpl implements ViewsRepository {

    private final List<Views> views;

    public ViewsRepositoryImpl() {
        this.views = new ArrayList<>();
    }

    @Override
    public Views save(Views view) {
        this.views.add( view );
        return view;
    }
}