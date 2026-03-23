# GameSessionResponse

Type: class | Package: com.hypixel.hytale.server.core.auth

class GameSessionResponse

Part of the Hytale server authentication system.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  public Instant getExpiresAtInstant()

Fields:
public String sessionToken
public String identityToken
public String expiresAt
public static final BuilderCodec<SessionServiceClient.GameSessionResponse> CODEC
