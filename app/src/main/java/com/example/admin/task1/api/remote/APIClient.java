package com.example.admin.task1.api.remote;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.example.admin.task1.BuildConfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 8/22/2017.
 */

public class APIClient {

    private static String host;

    private static Retrofit retrofit = null;


    public static Retrofit getClient(final String baseUrl) {
        if (retrofit==null) {
            Interceptor interceptor = new Interceptor() {
                @Override
                public Response intercept(@NonNull Chain chain) throws IOException {
                    HttpUrl.Builder builder = chain.request().url().newBuilder();
                    HttpUrl newUrl = builder
                            .host(host)
                            .build();
                    final Request request = chain.request().newBuilder()
                            .url(newUrl)
//                            .addHeader("X-AUTH-TOKEN", SessionManager.getInstance().getAPIToken())
                            .build();
                    return chain.proceed(request);
                }
            };

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .addInterceptor(interceptor);

            if (BuildConfig.DEBUG) {
                APILogger logger  = new APILogger();
                logger.setLevel(HttpLoggingInterceptor.Level.BODY);
                httpClient.addInterceptor(logger);
            }

            OkHttpClient client = httpClient.build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    public static void setHost(String url) {
        host = Uri.parse(url).getHost();
    }


  /*
  //  public static final String BASE_URL = "https://gist.githubusercontent.com";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(final String baseUrl) {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }*/
}
