package cn.ypj.wowsrankbackend.utils;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpClient {

    private static final OkHttpClient httpClient = new OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .writeTimeout(5, TimeUnit.SECONDS)
            .build();

    public static String callThirdPartyAPI(String urlString) {
        String result = "";
        Request request = new Request.Builder().url(urlString).build();
        int maxRetries = 3;

        for (int i = 0; i < maxRetries; i++) {
            try (Response response = httpClient.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    result = response.body().string();
                    break;
                } else {
                    System.err.println("Error: " + response.code() + " " + response.message());

                    if (response.code() == 404 || response.code() == 503) {
                        // 等待 2 秒
                        Thread.sleep(2000);
                        continue;
                    } else {
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println("Error connecting to the URL: " + urlString);
            } catch (InterruptedException e) {
                System.err.println("Error while waiting to retry: " + urlString);
            }
        }

        return result;
    }

}
