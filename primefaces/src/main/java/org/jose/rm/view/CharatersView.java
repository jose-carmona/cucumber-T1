package org.jose.rm.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.jose.rm.service.CharactersService;

@ManagedBean(name="dtCharatersView")
@ViewScoped
public class CharatersView implements Serializable {

  private String personajes;

    @ManagedProperty("#{charactersService}")
    private CharactersService service;

    @PostConstruct
    public void init() {
        //personajes = service.getCharacters();
    }

/*
    public List<Character> getCharacters() {
        return personajes.getResults();
    }
*/
    public void setService(CharactersService service) {
        this.service = service;
    }
}
