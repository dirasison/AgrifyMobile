package com.example.agrify;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @FormUrlEncoded
    @POST("api/register")
    Call<RegisterResponse> registerUser(
            @Field("first_name") String first_name,
            @Field("last_name") String last_name,
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("api/login")
    Call<LoginResponse> loginUser(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("api/products")
    Call<ProductResponse> getProducts();

    @POST("/api/user/getCart")
    Call<ResponseBody> addToCart(@Body AddToCartRequest request);

    @GET("/api/user/{userId}/carts")
    Call<GetCartItemsResponse> getCartItemsByUserId(@Path("userId") int userId);

    @HTTP(method = "DELETE", path = "/api/user/cart/delete", hasBody = true)
    Call<ResponseBody> deleteCartItem(
            @Query("user_id") int userId,
            @Query("product_name") String productName
    );

    @POST("/api/user/cart/checkout/{userId}")
    Call<CheckoutResponse> checkout(
            @Path("userId") int userId,
            @Body CheckoutRequest request
    );

}
