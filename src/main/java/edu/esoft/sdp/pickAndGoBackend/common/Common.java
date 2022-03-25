package edu.esoft.sdp.pickAndGoBackend.common;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import edu.esoft.sdp.pickAndGoBackend.dto.DistanceTime;
import edu.esoft.sdp.pickAndGoBackend.dto.Location;
import edu.esoft.sdp.pickAndGoBackend.dto.TextValue;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@ResponseBody
public class Common
{
    public static Object getRequest(String url) throws IOException
    {
        //String jsonString = "{\"customerId\": \"1\", \"consultantTime\": [ { \"id\": \""+ SessionId +"\", \"status\": \"OPEN\" } ] }";
//        System.out.println(jsonString);
        URL obj = new URL(url);
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("GET");
        postConnection.setRequestProperty("Content-Type", "application/json; utf-8");
        postConnection.setRequestProperty("Accept", "application/json");

        StringBuilder response = new StringBuilder();
        postConnection.setDoOutput(true);
//        try (OutputStream os = postConnection.getOutputStream())
//        {
//            byte[] input = jsonString.getBytes("utf-8");
//            os.write(input, 0, input.length);
//        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(postConnection.getInputStream(), "utf-8")))
        {
            String responseLine = null;

            while ((responseLine = br.readLine()) != null)
            {
                response.append(responseLine.trim());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//        System.out.println(response.toString());
        return response;
    }

    public static DistanceTime calculateDistance(Location node1, Location node2) throws IOException
    {
        String url = "https://maps.googleapis.com/maps/api/distancematrix/json?destinations=" + node1.getLatitude().trim() + "%2C" + node1.getLongitude().trim() + "&origins=" + node2.getLatitude().trim() + "%2C" + node2.getLongitude().trim() + "&key=AIzaSyDEsKqiE9s7Rt3JA4IL2Uh0CnDwfVHkGeE";
//        String respObj = getRequest(url).toString();
        JsonObject data = new Gson().fromJson(getRequest(url).toString(), JsonObject.class);
        String status = data.get("status").isJsonNull() ? null : data.get("status").getAsString();
        String destination_addresses = data.get("destination_addresses").isJsonNull() ? null : data.get("destination_addresses").getAsString();
        String origin_addresses = data.get("origin_addresses").isJsonNull() ? null : data.get("origin_addresses").getAsString();

        JsonObject rows = data.get("rows").isJsonNull() ? null : (JsonObject) data.get("rows").getAsJsonArray().get(0);
        JsonObject elements = rows.get("elements").isJsonNull() ? null : (JsonObject) rows.get("elements").getAsJsonArray().get(0);
        JsonObject distance = elements.get("distance").isJsonNull() ? null : (JsonObject) elements.get("distance").getAsJsonObject();
        JsonObject duration = elements.get("duration").isJsonNull() ? null : (JsonObject) elements.get("duration").getAsJsonObject();

        //System.out.println(distance.get("text").getAsString());
        return new DistanceTime(new TextValue(distance.get("text").getAsString(),distance.get("value").getAsLong()), new TextValue(duration.get("text").getAsString(),duration.get("value").getAsLong()));
    }
}
