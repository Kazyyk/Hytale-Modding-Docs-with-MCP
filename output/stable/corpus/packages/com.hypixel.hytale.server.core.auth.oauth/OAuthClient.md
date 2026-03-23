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
