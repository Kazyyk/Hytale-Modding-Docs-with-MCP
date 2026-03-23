# ServerAuthManager

Type: class | Package: com.hypixel.hytale.server.core.auth

public class ServerAuthManager

Singleton manager for server-side authentication state. Handles OAuth flows (browser and device), game session creation/refresh via the Session Service, credential store management, token expiry scheduling, and multi-profile selection. Central coordination point for all server authentication operations.

## Singleton Access


public static ServerAuthManager getInstance()

Returns the singleton instance, creating it on first access (double-checked locking).

## Lifecycle


public void initialize()

Initializes the auth manager from command-line options and environment variables. Loads session/identity tokens if provided, validates them, and sets the auth mode.


public void initializeCredentialStore()

Initializes the credential store from server configuration and attempts to restore a previous session from stored credentials.


public void shutdown()

Cancels active flows, stops the refresh scheduler, and terminates the game session in singleplayer mode.


public void logout()

Clears all authentication state, credentials, and pending profiles.

## Token Access


@Nullable
public String getIdentityToken()


@Nullable
public String getSessionToken()


public boolean hasIdentityToken()


public boolean hasSessionToken()


@Nullable
public String getOAuthAccessToken()

Returns the OAuth access token, refreshing it first if needed. Returns `null` if refresh fails.

## OAuth Flows


public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(@Nonnull OAuthBrowserFlow flow)

Starts a browser-based OAuth flow. Returns `FAILED` in singleplayer mode.


public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(OAuthDeviceFlow flow)

Starts a device code OAuth flow. Returns `FAILED` in singleplayer mode.

## Profile Management


@Nullable
public SessionServiceClient.GameProfile[] getPendingProfiles()


public boolean selectPendingProfile(int index)

Selects a profile by 1-based index from the pending profiles list.


public boolean selectPendingProfileByUsername(String username)

## Status


public ServerAuthManager.AuthMode getAuthMode()


public boolean isSingleplayer()


public boolean isOwner(@Nullable UUID playerUuid)


public String getAuthStatus()

Returns a human-readable status string including auth mode, token presence, and expiry countdown.

## Inner Types

- AuthMode -- authentication mode enum
- AuthResult -- authentication result enum
