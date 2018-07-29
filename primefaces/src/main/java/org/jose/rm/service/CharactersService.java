package org.jose.rm.service;

import java.util.List;
import java.io.IOException;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.jose.rm.domain.Character;
import org.jose.rm.domain.Characters;

@ManagedBean(name = "charactersService")
@ApplicationScoped
public class CharactersService {

  private String targetUrl = "https://rickandmortyapi.com/";

  public Characters run(String url) throws IOException {

    OkHttpClient client = new OkHttpClient();
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).client(httpClient.build()).build();
    CharactersInterface service = retrofit.create(CharactersInterface.class);

    Call<Characters> callSync = service.getCharacters(20,1);
    Response<Characters> response = callSync.execute();
    Characters respuesta = response.body();

    return respuesta;

  }

  public List<Character> getCharacters() throws IOException {

    Characters per = this.run(targetUrl);

    return per.getResults();

  }
}
