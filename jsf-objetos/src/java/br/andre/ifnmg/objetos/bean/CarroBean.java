package br.andre.ifnmg.objetos.bean;

import br.andre.ifnmg.objetos.entidade.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author André Alves
 */

@ManagedBean
@SessionScoped
public class CarroBean {
    
    private Carro carro = new Carro();
    List<Carro> carros = new ArrayList<Carro>();
    
    public void adicionar(){
        carros.add(carro);
        carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
}
