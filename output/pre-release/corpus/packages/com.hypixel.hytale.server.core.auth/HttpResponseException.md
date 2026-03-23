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

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  public int getStatusCode()
  public String getResponseBody()
  private static String truncateBody(String body)

Fields:
private final int statusCode
private final String responseBody
