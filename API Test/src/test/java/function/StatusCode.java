package function;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.testng.Assert;

public class StatusCode {

    public void created(RequestSpecification rs) {
        Response response = rs.post();
        Assert.assertEquals(response.getStatusCode(),201);
    }

    public void ok(RequestSpecification rs) {
        Response response = rs.post();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    public void serverError(RequestSpecification rs) {
        Response response = rs.post();
        Assert.assertEquals(response.getStatusCode(),502);
        System.out.println("The response is : " + response.getStatusCode());
    }

}
