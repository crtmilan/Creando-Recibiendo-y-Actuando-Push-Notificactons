package com.example.lucia.mascotasproyecto.restApi;

import com.example.lucia.mascotasproyecto.R;
import com.example.lucia.mascotasproyecto.restApi.model.FollowResponse;
import com.example.lucia.mascotasproyecto.restApi.model.LikeResponse;
import com.example.lucia.mascotasproyecto.restApi.model.MascotaResponse;
import com.example.lucia.mascotasproyecto.restApi.model.UserInstagramResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

/**
 * Created by Lucia on 07/06/2017.
 */

public interface EndpointsApi {

    // Para obtener Recent_media_de_Self
    // https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();

    // Para obtener Recent_media_de_ID
    // https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET
    public Call<MascotaResponse> getRecentMediaid(@Url String url);

    // Para obtener el id buscando con el USERNAME
// https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET
    public Call<UserInstagramResponse> getIdbyUsername(@Url String url);

    // Para obtener los FolLows de este usuario
    //https://api.instagram.com/v1/users/self/follows?access_token=ACCESS-TOKEN

    @GET(ConstantesRestApi.KEY2_GET_FOLLOWS_SELF)
    Call<MascotaResponse> getfollowsself();

    // Para dar un dar LIKE a una media de INSTAGRAM mediante un POST
    //https://api.instagram.com/v1/media/{media-id}/likes?access_token=ACCESS-TOKEN

    @POST
    public Call<LikeResponse> postlikeenmedia(@Url String url);

// GET para verificar el estado actual de la relacion y de acuerdo al resultado dar entonces follow o unfollow
// GET https://api.instagram.com/v1/users/{user-id}/relationship?access_token=ACCESS-TOKEN

    @GET
    public Call<FollowResponse> getfollowunfollow(@Url String url);

// POST para dar follow o unfollow a una cuenta que yo sigo
// https://api.instagram.com/v1/users/{user-id}/relationship?access_token=ACCESS-TOKEN&action=follows
// https://api.instagram.com/v1/users/{user-id}/relationship?access_token=ACCESS-TOKEN&action=unfollows

    @FormUrlEncoded
    @POST
    public Call<FollowResponse> postfollowunfollow(@Url String url, @Field("action") String action);

}
