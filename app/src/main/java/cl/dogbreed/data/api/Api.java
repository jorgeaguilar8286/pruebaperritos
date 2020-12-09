package cl.dogbreed.data.api;



import cl.dogbreed.data.model.RazaImagen;
import cl.dogbreed.data.model.Razaslista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("api/breeds/list/all")
    Call<Razaslista> listaRazas();
    @GET("api/breed/{breed}/images")
    Call<RazaImagen> listaImagen(@Path("breed")String breed);
}
