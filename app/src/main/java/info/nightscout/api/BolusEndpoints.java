package info.nightscout.api;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface BolusEndpoints {

    class BolusEntry {
        String type;
        String dateString;
        float date;
        float mbg;
        String device;

        public BolusEntry() {  }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDateString() {
            return dateString;
        }

        public void setDateString(String dateString) {
            this.dateString = dateString;
        }

        public float getDate() {
            return date;
        }

        public void setDate(float date) {
            this.date = date;
        }

        public float getMbg() {
            return mbg;
        }

        public void setMbg(float mbg) {
            this.mbg = mbg;
        }

        public String getDevice() {
            return device;
        }

        public void setDevice(String device) {
            this.device = device;
        }

    }

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("/api/v1/entries")
    Call<ResponseBody> sendEntries(@Body List<BolusEntry> entries);

}



