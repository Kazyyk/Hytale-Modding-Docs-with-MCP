# SessionServiceClient

Type: class | Package: com.hypixel.hytale.server.core.auth

public class SessionServiceClient

HTTP client for the Hytale Session Service (sessions.hytale.com). Handles authorization grants, token exchange, JWKS retrieval, game profile listing, game session creation/refresh/termination. Uses virtual threads for async HTTP operations.

## Constructor


public SessionServiceClient(@Nonnull String sessionServiceUrl)

## Methods


public CompletableFuture<String> requestAuthorizationGrantAsync(@Nonnull String identityToken, @Nonnull String serverAudience, @Nonnull String bearerToken)

Requests an authorization grant from the Session Service for server-join authentication.


public CompletableFuture<String> exchangeAuthGrantForTokenAsync(@Nonnull String authorizationGrant, @Nonnull String x509Fingerprint, @Nonnull String bearerToken)

Exchanges an authorization grant and X.509 certificate fingerprint for an access token.


@Nullable
public SessionServiceClient.JwksResponse getJwks()

Fetches the JSON Web Key Set from the Session Service `/.well-known/jwks.json` endpoint.


@Nullable
public SessionServiceClient.GameProfile[] getGameProfiles(@Nonnull String oauthAccessToken)

Fetches available game profiles from the Account Data service.


public SessionServiceClient.GameSessionResponse createGameSession(@Nonnull String oauthAccessToken, @Nonnull UUID profileUuid)

Creates a new game session for the given profile UUID.


public CompletableFuture<SessionServiceClient.GameSessionResponse> refreshSessionAsync(@Nonnull String sessionToken)

Refreshes an existing game session using the current session token.


public void terminateSession(@Nonnull String sessionToken)

Terminates a game session via DELETE request.

## Inner Types

- AccessTokenResponse
- AuthGrantResponse
- GameProfile
- GameSessionResponse
- JwkKey
- JwksResponse
- LauncherDataResponse

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse (and 9 more)

Complete API:
  public CompletableFuture<String> requestAuthorizationGrantAsync(String identityToken, String serverAudience, String bearerToken)
  public CompletableFuture<String> exchangeAuthGrantForTokenAsync(String authorizationGrant, String x509Fingerprint, String bearerToken)
  public SessionServiceClient.JwksResponse getJwks()
  public SessionServiceClient.GameProfile[] getGameProfiles(String oauthAccessToken)
  public SessionServiceClient.GameSessionResponse createGameSession(String oauthAccessToken, UUID profileUuid)
  public CompletableFuture<SessionServiceClient.GameSessionResponse> refreshSessionAsync(String sessionToken)
  public void terminateSession(String sessionToken)
  private static String escapeJsonString(String value)
  private static KeyedCodec<T> externalKey(String key, Codec<T> codec)

Fields:
private static final HytaleLogger LOGGER
private static final ExecutorService HTTP_EXECUTOR
private final HttpClient httpClient
private final String sessionServiceUrl
