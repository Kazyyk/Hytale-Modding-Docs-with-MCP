# MemoryAuthCredentialStoreProvider

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: AuthCredentialStoreProvider

public class MemoryAuthCredentialStoreProvider implements AuthCredentialStoreProvider

Factory that creates in-memory (non-persistent) credential stores. Registered as the default provider with `Priority.DEFAULT`.

## Constants


public static final String ID = "Memory"

## Methods


@Nonnull
@Override
public IAuthCredentialStore createStore()

Creates a DefaultAuthCredentialStore (in-memory, non-persistent).

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 8 more)

Complete API:
  public IAuthCredentialStore createStore()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<MemoryAuthCredentialStoreProvider> CODEC
