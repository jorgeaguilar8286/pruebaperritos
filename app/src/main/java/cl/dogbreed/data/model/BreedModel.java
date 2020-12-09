package cl.dogbreed.data.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cl.dogbreed.domain.presenter.IPresenterModel;
import cl.dogbreed.data.api.Api;
import cl.dogbreed.data.api.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BreedModel implements InterfazModel {
 IPresenterModel iPresenterModel;

    public BreedModel(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    @Override
    public void loadBreeds() {
      Api servicio = RetrofitClient.getRetrofitInstance().create(Api.class);
        Call<Razaslista> listCall = servicio.listaRazas();
        List<String> list = new ArrayList<>();
        listCall.enqueue(new Callback<Razaslista>() {
            @Override
            public void onResponse(Call<Razaslista> call, Response<Razaslista> response) {
                Razaslista breedList = response.body();
        Map<String, List<String>> map = breedList.getMessage();
        for (String key : map.keySet()) {
            if (map.get(key).isEmpty()) {
                list.add(key);
            } else {
                for (String subBreed : map.get(key)) {
                    list.add(key + " " + subBreed);
                }
            }}
                iPresenterModel.notificar(list);
            }


            @Override
            public void onFailure (Call<Razaslista> call, Throwable t){

            }
        });
            }

    @Override
    public void loadImages(String raza, String subRaza) {

    }
}
