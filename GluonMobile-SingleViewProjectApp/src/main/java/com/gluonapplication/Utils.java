package com.gluonapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * create by GengQing on 2019/4/8
 */
public class Utils {

    public static String loadString(String resourceLocation) {
        InputStream inputStream = GluonApplication.class.getResourceAsStream(resourceLocation);
        return convert(inputStream, Charset.forName("UTF8"));
    }

    public static String convert(InputStream inputStream, Charset charset) {

        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    public static List<String> convertToList(InputStream inputStream, Charset charset) {

        List<String> list = new ArrayList<>();
        String line = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static List loadContent(String fileLocation) {
        InputStream stream = GluonApplication.class.getResourceAsStream(fileLocation);
        return convertToList(stream, Charset.forName("UTF8"));
    }
}
