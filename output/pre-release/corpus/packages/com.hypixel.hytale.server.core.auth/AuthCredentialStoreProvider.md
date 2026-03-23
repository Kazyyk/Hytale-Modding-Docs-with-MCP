# AuthCredentialStoreProvider

Type: interface | Package: com.hypixel.hytale.server.core.auth

public interface AuthCredentialStoreProvider

Factory interface for creating credential store instances. Implementations are registered on the `CODEC` for JSON-based configuration. Each provider type produces a specific `IAuthCredentialStore` implementation.

## Fields


BuilderCodecMapCodec<AuthCredentialStoreProvider> CODEC

Polymorphic codec for deserializing provider implementations from configuration. Keyed by `"Type"` with case-insensitive matching.

## Methods


@Nonnull
IAuthCredentialStore createStore()

Creates and returns a new credential store instance.

Known implementors: EncryptedAuthCredentialStoreProvider, MemoryAuthCredentialStoreProvider

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  IAuthCredentialStore createStore()

Fields:
BuilderCodecMapCodec<AuthCredentialStoreProvider> CODEC
