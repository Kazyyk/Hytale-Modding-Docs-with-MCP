# EncryptedAuthCredentialStoreProvider

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: AuthCredentialStoreProvider

public class EncryptedAuthCredentialStoreProvider implements AuthCredentialStoreProvider

Factory that creates `EncryptedAuthCredentialStore` instances with a configurable file path. Validates that the path is within a trusted root directory.

## Constants


public static final String ID = "Encrypted"


public static final String DEFAULT_PATH = "auth.enc"

## Methods


@Nonnull
@Override
public IAuthCredentialStore createStore()

Creates an EncryptedAuthCredentialStore at the configured path. Throws `IllegalStateException` if the path is outside a trusted root directory.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  public IAuthCredentialStore createStore()
  public String toString()

Fields:
public static final String ID
public static final String DEFAULT_PATH
public static final BuilderCodec<EncryptedAuthCredentialStoreProvider> CODEC
private String path
