# OAuthTokens

Type: record | Package: com.hypixel.hytale.server.core.auth

public record OAuthTokens(@Nullable String accessToken, @Nullable String refreshToken, @Nullable Instant accessTokenExpiresAt)

Part of the Hytale server authentication system.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 8 more)

Complete API:
  public boolean isValid()
