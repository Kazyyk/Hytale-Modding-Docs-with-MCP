# JWTClaims

Type: class | Package: com.hypixel.hytale.server.core.auth

class JWTClaims

Part of the Hytale server authentication system.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse, MemoryAuthCredentialStoreProvider (and 8 more)

Complete API:
  public UUID getSubjectAsUUID()

Fields:
public String issuer
public String audience
public String subject
public String username
public String ipAddress
public Long issuedAt
public Long expiresAt
public Long notBefore
public String certificateFingerprint
