package cl.dogbreed.data.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cl.dogbreed.domain.presenter.IPresenterModel;
import cl.dogbreed.data.api.Api;
import cl.dogbreed.data.api.RetrofitClient;
import cl.dogbreed.domain.presenter.PresenterList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositorio implements InterfazModel {

    IPresenterModel iPresenterModel;

    public Repositorio(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    private static final String TAG ="Breedmodel";
    @Override
    public void loadBreeds() {
        Api servicio = RetrofitClient.getRetrofitInstance().create(Api.class);
          Call<Razaslista> listCall = servicio.listaRazas();
          List<String> list = new ArrayList<>();
          listCall.enqueue(new Callback<Razaslista>() {
            @Override
            public void onResponse(Call<Razaslista> call, Response<Razaslista> response) {
                Razaslista breedList = response.body();

                Log.d(TAG, "onResponse: " + response.body().getMessage().keySet().toString());
                Map<String, List<String>> map = breedList.getMessage();
                for (String key : map.keySet()) {
                    if (map.get(key).isEmpty()) {
                        list.add(key);
                    } else {
                        for (String subRaza : map.get(key)) {
                            list.add(key + " " + subRaza);
                        }
                    }}
                iPresenterModel.notificar(list);
            }


            @Override
            public void onFailure(Call<Razaslista> call, Throwable t) {
                Log.d(TAG, "onFailure: "+ t.toString());

            }
        });

            }

    @Override
    public void loadImages(String raza, String subRaza) {

    }
}


