# OAuthFlow

Type: class | Package: com.hypixel.hytale.server.core.auth.oauth

abstract class OAuthFlow

Abstract base class for all OAuth flows. Manages the flow lifecycle via a `CompletableFuture<OAuthResult>`, storing the token response on success or an error message on failure.

## Methods


public OAuthClient.TokenResponse getTokenResponse()


public OAuthResult getResult()


public String getErrorMessage()


public CompletableFuture<OAuthResult> getFuture()

Returns the future that completes when the flow finishes.
