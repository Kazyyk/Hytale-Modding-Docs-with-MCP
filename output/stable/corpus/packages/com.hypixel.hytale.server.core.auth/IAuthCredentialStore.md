# IAuthCredentialStore

Type: interface | Package: com.hypixel.hytale.server.core.auth

public interface IAuthCredentialStore

Interface for storing and retrieving OAuth credentials and the selected game profile UUID. Implementations include in-memory and encrypted-on-disk variants.

## Methods


void setTokens(@Nonnull IAuthCredentialStore.OAuthTokens var1)


@Nonnull
IAuthCredentialStore.OAuthTokens getTokens()


void setProfile(@Nullable UUID var1)


@Nullable
UUID getProfile()


void clear()

Clears all stored credentials and profile data.

## Inner Types

- OAuthTokens -- record holding token data

Known implementors: DefaultAuthCredentialStore, EncryptedAuthCredentialStore

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse, MemoryAuthCredentialStoreProvider (and 8 more)

Complete API:
  void setTokens(IAuthCredentialStore.OAuthTokens var1)
  IAuthCredentialStore.OAuthTokens getTokens()
  void setProfile(UUID var1)
  UUID getProfile()
  void clear()
