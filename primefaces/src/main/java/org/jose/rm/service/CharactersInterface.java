package org.jose.rm.service;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import org.jose.rm.domain.Characters;

public interface CharactersInterface {

    @GET("/api/character/")
    public Call<Characters> getCharacters(@Query("per_page") int per_page, @Query("page") int page);

}
