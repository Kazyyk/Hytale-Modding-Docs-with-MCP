# OAuthClient

Type: class | Package: com.hypixel.hytale.server.core.auth.oauth

public class OAuthClient

OAuth 2.0 client implementation supporting both browser-based (authorization code with PKCE) and device code flows. Manages local HTTP callback server for browser flow, PKCE challenge generation, token exchange, and token refresh against the Hytale OAuth endpoints.

## Methods


public Runnable startFlow(@Nonnull OAuthBrowserFlow flow)

Starts a browser-based OAuth authorization code flow with PKCE. Launches a local HTTP callback server, generates a CSRF state and PKCE code verifier, and calls `flow.onFlowInfo()` with the authorization URL. Returns a `Runnable` that cancels the flow when invoked.


public Runnable startFlow(OAuthDeviceFlow flow)

Starts a device code flow. Requests device authorization, calls `flow.onFlowInfo()` with the user code and verification URI, then polls for token completion. Returns a `Runnable` that cancels the flow.


@Nullable
public OAuthClient.TokenResponse refreshTokens(@Nonnull String refreshToken)

Refreshes OAuth tokens using the given refresh token. Returns `null` on failure.

## Inner Types

- TokenResponse -- OAuth token endpoint response
- DeviceAuthResponse -- device authorization endpoint response

Also in this package: DeviceAuthResponse, OAuthBrowserFlow, OAuthDeviceFlow, OAuthFlow, OAuthResult, TokenResponse

Complete API:
  public Runnable startFlow(OAuthBrowserFlow flow)
  public Runnable startFlow(OAuthDeviceFlow flow)
  public OAuthClient.TokenResponse refreshTokens(String refreshToken)
  private String buildAuthUrl(String state, String codeChallenge, String redirectUri)
  private OAuthClient.TokenResponse exchangeCodeForTokens(String code, String codeVerifier, String redirectUri)
  private OAuthClient.DeviceAuthResponse requestDeviceAuthorization()
  private OAuthClient.TokenResponse pollDeviceToken(String deviceCode)
  private String generateRandomString(int length)
  private String generateCodeChallenge(String verifier)
  private String extractParam(String query, String name)
  private String encodeStateWithPort(String state, int port)
  private OAuthClient.TokenResponse parseTokenResponse(String json)
  private OAuthClient.DeviceAuthResponse parseDeviceAuthResponse(String json)
  private static String getJsonString(JsonObject obj, String key)
  private static int getJsonInt(JsonObject obj, String key, int defaultValue)
  private static String buildHtmlPage(boolean success, String title, String heading, String message, String errorDetail)

Fields:
private static final HytaleLogger LOGGER
private static final SecureRandom RANDOM
private final HttpClient httpClient
