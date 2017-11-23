
package ds.mygoogleimage.model.responseerror;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.Error;

public class SearchResponseError {

    @SerializedName("error")
    @Expose
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}
