# HttpResponseException

Type: class | Package: com.hypixel.hytale.server.core.auth | Extends: java.io.IOException

public class HttpResponseException extends IOException

Thrown when an HTTP request during authentication returns a non-success status code. Captures both the status code and the response body (truncated to 200 characters in the exception message).

## Constructors


public HttpResponseException(int statusCode, String responseBody)

Creates an exception with the given HTTP status code and response body.

## Methods


public int getStatusCode()

Returns the HTTP status code.


public String getResponseBody()

Returns the full response body string.

## Related Types

- `ServerAuthManager` -- may throw this during authentication flows
- `JWTValidator` -- may throw this during token validation
