package cl.dogbreed.domain.presenter;

import java.util.List;

import cl.dogbreed.data.model.InterfazModel;
import cl.dogbreed.data.model.Repositorio;
import cl.dogbreed.ui.presenterview.IPresenterViewList;

public class PresenterList implements IPresenterList,IPresenterModel{
 InterfazModel interfazModel;
 IPresenterViewList iPresenterViewList;
 Repositorio repositorio;

    public PresenterList(IPresenterViewList iPresenterViewList, Repositorio repositorio) {
        this.iPresenterViewList = iPresenterViewList;
        this.repositorio = repositorio;
    }

    public void setInterfazModel(InterfazModel interfazModel) {
        this.interfazModel = interfazModel;
    }

    @Override
    public void loadBreeds() {
      interfazModel.loadBreeds();
    }

    @Override
    public void notificar(List<String> list) {
        iPresenterViewList.notificar(list);

    }
}
