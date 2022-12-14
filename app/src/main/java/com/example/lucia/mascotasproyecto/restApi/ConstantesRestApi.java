package com.example.lucia.mascotasproyecto.restApi;

import java.security.PublicKey;

/**
 * Created by Lucia on 07/06/2017.
 */

public final class ConstantesRestApi {
    public static final String VERSION ="/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    // public static final String ACCESS_TOKEN = "5538249605.cf3ae63.c8d711a2667d48f9aa0d5d6ab9d3f3e7";

    public static final String ACCESS_TOKEN ="5538249605.99222c6.92bba3efaa464b2d808597719e99c8d3";
    public static final String KEY_ACCESS_TOKEN = "?access_token=";

    // Para armar la busqueda de medios recientes de mi misma
    // https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    public static final String KEY_GET_RECENT_MEDIA_USER = "users/self/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    // para armar la busqueda de medios recientes por id
    // https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN

    public static final String KEY1_GET_USER_ID_MEDIA   = "users/";
    public static final String KEY2_GET_USER_ID_MEDIA   = "5538249605";
    public static final String KEY3_GET_USER_ID_MEDIA   = "/media/recent/";
    public static final String KEY4_GET_USER_ID_MEDIA   =  KEY3_GET_USER_ID_MEDIA + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    // Se arma hasta que tenga el ID

    // Para buscar el Username que escriben en el TextView

    // https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN

    public static final String KEY2_ACCESS_TOKEN = "&access_token=";
    public static final String KEY1_GET_ID_DE_USERNAME   = "users/search?q=";
    public static final String KEY2_GET_ID_DE_USERNAME   = "perritoconnor";
    public static final String KEY3_GET_ID_DE_USERNAME   =  KEY2_ACCESS_TOKEN + ACCESS_TOKEN;

    // Se arma cuando se tenga el USERNAME

    //https://api.instagram.com/v1/users/self/follows?access_token=ACCESS-TOKEN

    public static final String KEY1_GET_FOLLOWS_SELF    = "users/self/follows";
    public static final String KEY2_GET_FOLLOWS_SELF    = KEY1_GET_FOLLOWS_SELF + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //curl -F 'access_token=ACCESS-TOKEN' \
   // https://api.instagram.com/v1/media/{media-id}/likes

    //  POST  https://api.instagram.com/v1/media/{media-id}/likes?access_token=ACCESS-TOKEN
    // Con este EndPoint se da un like a una foto de Instagram

    public static final String KEY1_POST_MEDIA_LIKE = "media/";
    public static final String KEY2_POST_MEDIA_LIKE = "/likes";
    public static final String KEY3_POST_MEDIA_LIKE = KEY2_POST_MEDIA_LIKE + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    // GET https://api.instagram.com/v1/users/{user-id}/relationship?access_token=ACCESS-TOKEN

    public static final String KEY1_GET_RELATIONSHIP = "users/";
    public static final String KEY2_GET_RELATIONSHIP = "/relationship" + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    // POST https://api.instagram.com/v1/users/{user-id}/relationship?access_token=ACCESS-TOKEN
    //Este Endpoint da follow y unfollow (a la persona que raiteo tu foto)


    public static final String KEY1_POST_RELATIONSHIP = "users/%s/relationship";
    public static final String KEY2_POST_RELATIONSHIP = KEY1_POST_RELATIONSHIP + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

}
