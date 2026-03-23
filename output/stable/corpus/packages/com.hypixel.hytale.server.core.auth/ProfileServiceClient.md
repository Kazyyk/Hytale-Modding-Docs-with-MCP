# ProfileServiceClient

Type: class | Package: com.hypixel.hytale.server.core.auth

public class ProfileServiceClient

HTTP client for the Hytale Profile Service (account-data.hytale.com). Provides synchronous and asynchronous methods to look up game profiles by UUID or username using Bearer token authentication.

## Constructor


public ProfileServiceClient(@Nonnull String profileServiceUrl)

## Methods


@Nullable
public ProfileServiceClient.PublicGameProfile getProfileByUuid(@Nonnull UUID uuid, @Nonnull String bearerToken)

Fetches a game profile by UUID using Bearer authentication. Returns `null` on any failure.


public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUuidAsync(@Nonnull UUID uuid, @Nonnull String bearerToken)


@Nullable
public ProfileServiceClient.PublicGameProfile getProfileByUsername(@Nonnull String username, @Nonnull String bearerToken)

Fetches a game profile by username using Bearer authentication. Returns `null` on any failure.


public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUsernameAsync(@Nonnull String username, @Nonnull String bearerToken)

## Inner Types

- PublicGameProfile -- profile data returned by the service

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 8 more)

Complete API:
  public ProfileServiceClient.PublicGameProfile getProfileByUuid(UUID uuid, String bearerToken)
  public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUuidAsync(UUID uuid, String bearerToken)
  public ProfileServiceClient.PublicGameProfile getProfileByUsername(String username, String bearerToken)
  public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUsernameAsync(String username, String bearerToken)
  private static KeyedCodec<T> externalKey(String key, Codec<T> codec)

Fields:
private static final HytaleLogger LOGGER
private final HttpClient httpClient
private final String profileServiceUrl
