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

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse (and 9 more)

Complete API:
  public static ServerAuthManager getInstance()
  public ProfileServiceClient getProfileServiceClient()
  public void initialize()
  public void checkPendingFatalError()
  public void initializeCredentialStore()
  public void shutdown()
  public void logout()
  public SessionServiceClient.GameSessionResponse getGameSession()
  public void setGameSession(SessionServiceClient.GameSessionResponse session)
  public String getIdentityToken()
  public String getSessionToken()
  public boolean hasIdentityToken()
  public boolean hasSessionToken()
  public String getOAuthAccessToken()
  public void setServerCertificate(X509Certificate certificate)
  public X509Certificate getServerCertificate()
  public String getServerCertificateFingerprint()
  public UUID getServerSessionId()
  public ServerAuthManager.AuthMode getAuthMode()
  public boolean isSingleplayer()
  public boolean isOwner(UUID playerUuid)
  public SessionServiceClient.GameProfile getSelectedProfile()
  public Instant getTokenExpiry()
  public String getAuthStatus()
  public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(OAuthBrowserFlow flow)
  public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(OAuthDeviceFlow flow)
  public CompletableFuture<ServerAuthManager.AuthResult> registerCredentialStore(IAuthCredentialStore store)
  public void swapCredentialStoreProvider(AuthCredentialStoreProvider provider)
  public boolean cancelActiveFlow()
  public SessionServiceClient.GameProfile[] getPendingProfiles()
  public boolean hasPendingProfiles()
  public boolean selectPendingProfile(int index)
  public boolean selectPendingProfileByUsername(String username)
  public void clearPendingProfiles()
  private boolean validateOfflineToken(String offlineToken)
  private boolean validateInitialTokens(String sessionToken, String identityToken)
  private ServerAuthManager.AuthResult createGameSessionFromOAuth(ServerAuthManager.AuthMode mode)
  private boolean refreshOAuthTokens()
  private boolean refreshOAuthTokens(boolean force)
  private SessionServiceClient.GameProfile tryAutoSelectProfile(SessionServiceClient.GameProfile[] profiles)
  private boolean completeAuthWithProfile(SessionServiceClient.GameProfile profile, ServerAuthManager.AuthMode mode)
  private SessionServiceClient.GameSessionResponse createGameSession(UUID profileUuid)
  private void parseAndScheduleRefresh()
  private Instant getEffectiveExpiry(SessionServiceClient.GameSessionResponse session)
  private Instant parseIdentityTokenExpiry(String idToken)
  private void setExpiryAndScheduleRefresh(Instant expiry)
  private void attemptSessionRefresh(int attempt)
  private boolean refreshGameSession(String currentSessionToken)
  private boolean refreshGameSessionViaOAuth()

Fields:
private static final HytaleLogger LOGGER
private static final int REFRESH_BUFFER_SECONDS
private static final int REFRESH_MAX_RETRIES
private static final int REFRESH_RETRY_BASE_DELAY_SECONDS
private static volatile ServerAuthManager instance
private volatile ServerAuthManager.AuthMode authMode
private volatile Instant tokenExpiry
private final AtomicReference<SessionServiceClient.GameSessionResponse> gameSession
private final AtomicReference<IAuthCredentialStore> credentialStore
private final Map<UUID,SessionServiceClient.GameProfile> availableProfiles
private volatile SessionServiceClient.GameProfile[] pendingProfiles
private volatile ServerAuthManager.AuthMode pendingAuthMode
private final AtomicReference<X509Certificate> serverCertificate
private final UUID serverSessionId
private volatile boolean isSingleplayer
private OAuthClient oauthClient
private volatile SessionServiceClient sessionServiceClient
private volatile ProfileServiceClient profileServiceClient
private final ScheduledExecutorService refreshScheduler
private ScheduledFuture<?> refreshTask
private Runnable cancelActiveFlow
private volatile String pendingFatalError
