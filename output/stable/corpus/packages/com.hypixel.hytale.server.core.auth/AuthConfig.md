# AuthConfig

Type: class | Package: com.hypixel.hytale.server.core.auth

public class AuthConfig

Central configuration constants for the Hytale authentication system. Contains OAuth URLs, HTTP client settings, environment variable names, and scope definitions. All fields are static constants; this class cannot be instantiated.

## Constants

- USER_AGENT | String | "HytaleServer/" + ManifestUtil.getImplementationVersion()
- OAUTH_AUTH_URL | String | "https://oauth.accounts.hytale.com/oauth2/auth"
- OAUTH_TOKEN_URL | String | "https://oauth.accounts.hytale.com/oauth2/token"
- DEVICE_AUTH_URL | String | "https://oauth.accounts.hytale.com/oauth2/device/auth"
- CONSENT_REDIRECT_URL | String | "https://accounts.hytale.com/consent/client"
- SESSION_SERVICE_URL | String | "https://sessions.hytale.com"
- ACCOUNT_DATA_URL | String | "https://account-data.hytale.com"
- BUILD_ENVIRONMENT | String | "release"
- CLIENT_ID | String | "hytale-server"
- SCOPES | String[] | {"openid", "offline", "auth:server"}
- SCOPE_CLIENT | String | "hytale:client"
- SCOPE_SERVER | String | "hytale:server"
- SCOPE_EDITOR | String | "hytale:editor"
- HTTP_TIMEOUT | Duration | Duration.ofSeconds(30L)
- DEVICE_POLL_INTERVAL_SECONDS | int | 15
- ENV_SERVER_AUDIENCE | String | "HYTALE_SERVER_AUDIENCE"
- ENV_SERVER_IDENTITY_TOKEN | String | "HYTALE_SERVER_IDENTITY_TOKEN"
- ENV_SERVER_SESSION_TOKEN | String | "HYTALE_SERVER_SESSION_TOKEN"

## Methods


@Nonnull
public static String getServerAudience()

Returns the server audience string. Uses the `HYTALE_SERVER_AUDIENCE` environment variable if set, otherwise falls back to the server session ID from `ServerAuthManager`.

Also in this package: AccessTokenResponse, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse, MemoryAuthCredentialStoreProvider (and 8 more)

Complete API:
  public static String getServerAudience()

Fields:
public static final String USER_AGENT
public static final String OAUTH_AUTH_URL
public static final String OAUTH_TOKEN_URL
public static final String DEVICE_AUTH_URL
public static final String CONSENT_REDIRECT_URL
public static final String SESSION_SERVICE_URL
public static final String ACCOUNT_DATA_URL
public static final String BUILD_ENVIRONMENT
public static final String CLIENT_ID
public static final String[] SCOPES
public static final String SCOPE_CLIENT
public static final String SCOPE_SERVER
public static final String SCOPE_EDITOR
public static final Duration HTTP_TIMEOUT
public static final int DEVICE_POLL_INTERVAL_SECONDS
public static final String ENV_SERVER_AUDIENCE
public static final String ENV_SERVER_IDENTITY_TOKEN
public static final String ENV_SERVER_SESSION_TOKEN
private static final String SERVER_AUDIENCE_OVERRIDE
