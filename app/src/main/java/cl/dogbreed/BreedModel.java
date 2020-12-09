package cl.dogbreed;

import cl.dogbreed.RetrofitClient;
import cl.dogbreed.Api;

public class BreedModel implements InterfazModel{
 IPresenterModel iPresenterModel;

    public BreedModel(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    @Override
    public void loadBreeds() {
      Api servicio = RetrofitClient.getRetrofitInstance().create(Api.class);
    }

    @Override
    public void loadImages(String raza, String subRaza) {

    }
}
