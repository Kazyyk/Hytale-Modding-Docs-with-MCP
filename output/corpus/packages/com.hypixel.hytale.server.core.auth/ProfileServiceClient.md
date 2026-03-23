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
