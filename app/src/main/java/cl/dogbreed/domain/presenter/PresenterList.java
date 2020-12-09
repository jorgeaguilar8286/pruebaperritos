package cl.dogbreed.domain.presenter;

import java.util.List;

import cl.dogbreed.data.model.InterfazModel;
import cl.dogbreed.ui.presenter.IPresenterViewList;

public class PresenterList implements IPresenterList,IPresenterModel{
 InterfazModel interfazModel;
 IPresenterViewList iPresenterViewList;

    public PresenterList(IPresenterViewList iPresenterViewList) {
        this.iPresenterViewList = iPresenterViewList;
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
        iPresenterViewList.showDogs(list);

    }
}
