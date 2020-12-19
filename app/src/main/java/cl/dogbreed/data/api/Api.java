package cl.dogbreed.data.api;



import cl.dogbreed.data.model.RazaImagen;
import cl.dogbreed.data.model.Razaslista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("breeds/list/all")
    Call<Razaslista> listaRazas();
    @GET("breed/{breed}/images")
    Call<RazaImagen> listaImagenes(@Path("breed")String breed);
}
