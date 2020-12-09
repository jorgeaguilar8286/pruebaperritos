package cl.dogbreed.domain.presenter;

public interface IPresenterDetail {
    void loadBreedImages(String loadBI);
    void loadSubBreedImages(String lBreed,String lSubBreed);
    void saveFavorite(Favorite favorite);
}
