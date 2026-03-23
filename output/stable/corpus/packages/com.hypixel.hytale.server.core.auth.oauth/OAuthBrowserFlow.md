# OAuthBrowserFlow

Type: class | Package: com.hypixel.hytale.server.core.auth.oauth | Extends: OAuthFlow

public abstract class OAuthBrowserFlow extends OAuthFlow

Abstract base for browser-based OAuth authorization code flow with PKCE. Subclasses implement `onFlowInfo(String)` to present the authorization URL to the user.

## Abstract Methods


public abstract void onFlowInfo(String var1)

Called with the authorization URL that the user should visit to complete authentication.
