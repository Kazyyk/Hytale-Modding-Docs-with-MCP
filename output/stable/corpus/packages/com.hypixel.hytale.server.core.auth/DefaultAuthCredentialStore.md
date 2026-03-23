# DefaultAuthCredentialStore

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: IAuthCredentialStore

public class DefaultAuthCredentialStore implements IAuthCredentialStore

In-memory credential store that does not persist tokens across restarts. Stores OAuth tokens and profile UUID in volatile fields.

## Methods

Implements all methods from IAuthCredentialStore. Stores tokens and profile UUID in volatile instance fields. `clear()` resets both to their default values.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse, MemoryAuthCredentialStoreProvider (and 8 more)

Complete API:
  public void setTokens(IAuthCredentialStore.OAuthTokens tokens)
  public IAuthCredentialStore.OAuthTokens getTokens()
  public void setProfile(UUID uuid)
  public UUID getProfile()
  public void clear()

Fields:
private IAuthCredentialStore.OAuthTokens tokens
private UUID profile
