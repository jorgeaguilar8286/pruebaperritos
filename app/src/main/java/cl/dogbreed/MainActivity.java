package cl.dogbreed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cl.dogbreed.data.model.Repositorio;
import cl.dogbreed.domain.presenter.PresenterList;
import cl.dogbreed.ui.presenterview.IPresenterViewList;
import cl.dogbreed.ui.view.DetailFragment;
import cl.dogbreed.ui.view.DogAdapter;
import cl.dogbreed.ui.view.OnListFragmentInteractionListener;

/*
1. X Agregar dependencias y permisos
2. X Activar viewBinding
3. X Crear package modelo : los pojos y RetrofitClient
4. X Crear y diseñar Layout con ReciclerView
5. X Crear Clase presenter
6.   Crear clase adapter . viewHolder enlazar a ReciclerView
7.   Enlazar vista con Presenter
 */


public class MainActivity extends AppCompatActivity implements IPresenterViewList {
    private DogAdapter adapter;
    private PresenterList presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       presenter = new PresenterList(this);
       adapter = new DogAdapter(new ArrayList<>());
       recyclerView = findViewById(R.id.recycleview);
       recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));
       recyclerView.setAdapter(adapter);
    }


    @Override
    public void notificar(List<String> list) {
        adapter.updateBreeds(list);
    }
}
