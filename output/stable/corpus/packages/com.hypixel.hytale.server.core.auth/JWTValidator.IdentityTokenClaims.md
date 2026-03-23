# IdentityTokenClaims

Type: class | Package: com.hypixel.hytale.server.core.auth

class IdentityTokenClaims

Part of the Hytale server authentication system.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse, MemoryAuthCredentialStoreProvider (and 8 more)

Complete API:
  public UUID getSubjectAsUUID()
  public String[] getScopes()
  public boolean hasScope(String targetScope)

Fields:
public String issuer
public String subject
public String username
public String[] entitlements
public String skin
public Long issuedAt
public Long expiresAt
public Long notBefore
public String scope
