package testcase;

import config.Base;
import config.BaseUrl;
import function.StatusCode;
import org.testng.annotations.Test;

public class TestPost extends Base {

    @Test(testName = "Validate response Post Data")
    public void login() {
        BaseUrl baseUrl = new BaseUrl();
        StatusCode statusCode = new StatusCode();

        rs.baseUri(baseUrl.urls("/posts"));
        rs.given().urlEncodingEnabled(true)
                .param("username", "admin@ct.co.id")
                .param("password","admin")
                .header("dest","omega");
        statusCode.serverError(rs);
    }

}
