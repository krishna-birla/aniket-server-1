# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizationMessageIdPut**](DefaultApi.md#authorizationMessageIdPut) | **PUT** /authorization/{messageId} | Removes funds from a user&#39;s account if sufficient funds are available. |
| [**loadMessageIdPut**](DefaultApi.md#loadMessageIdPut) | **PUT** /load/{messageId} | Adds funds to a user&#39;s account. |
| [**pingGet**](DefaultApi.md#pingGet) | **GET** /ping | Tests the availability of the service and returns the current server time. |


<a id="authorizationMessageIdPut"></a>
# **authorizationMessageIdPut**
> AuthorizationResponse authorizationMessageIdPut(messageId, authorizationRequest)

Removes funds from a user&#39;s account if sufficient funds are available.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String messageId = "messageId_example"; // String | Unique identifier for a message
    AuthorizationRequest authorizationRequest = new AuthorizationRequest(); // AuthorizationRequest | An authorization request message that needs to be decisioned.
    try {
      AuthorizationResponse result = apiInstance.authorizationMessageIdPut(messageId, authorizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authorizationMessageIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageId** | **String**| Unique identifier for a message | |
| **authorizationRequest** | [**AuthorizationRequest**](AuthorizationRequest.md)| An authorization request message that needs to be decisioned. | [optional] |

### Return type

[**AuthorizationResponse**](AuthorizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The result of an authorization |  -  |
| **0** | Server Error response |  -  |

<a id="loadMessageIdPut"></a>
# **loadMessageIdPut**
> LoadResponse loadMessageIdPut(messageId, loadRequest)

Adds funds to a user&#39;s account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String messageId = "messageId_example"; // String | Unique identifier for a message
    LoadRequest loadRequest = new LoadRequest(); // LoadRequest | An load request message that needs to be decisioned. This balance will be added to a user's balance.
    try {
      LoadResponse result = apiInstance.loadMessageIdPut(messageId, loadRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#loadMessageIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageId** | **String**| Unique identifier for a message | |
| **loadRequest** | [**LoadRequest**](LoadRequest.md)| An load request message that needs to be decisioned. This balance will be added to a user&#39;s balance. | [optional] |

### Return type

[**LoadResponse**](LoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The result of an load |  -  |
| **0** | Server Error response |  -  |

<a id="pingGet"></a>
# **pingGet**
> Ping pingGet()

Tests the availability of the service and returns the current server time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Ping result = apiInstance.pingGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pingGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Ping**](Ping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ping successful response |  -  |
| **0** | Server Error response |  -  |

