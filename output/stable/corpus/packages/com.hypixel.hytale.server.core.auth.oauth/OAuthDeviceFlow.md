# OAuthDeviceFlow

Type: class | Package: com.hypixel.hytale.server.core.auth.oauth | Extends: OAuthFlow

public abstract class OAuthDeviceFlow extends OAuthFlow

Abstract base for OAuth device code flow. Subclasses implement `onFlowInfo(String, String, String, int)` to present the user code and verification URI.

## Abstract Methods


public abstract void onFlowInfo(String var1, String var2, String var3, int var4)

Called with the user code, verification URI, complete verification URI, and expiration in seconds.

Known subclasses: AuthFlow

Also in this package: DeviceAuthResponse, OAuthBrowserFlow, OAuthClient, OAuthFlow, OAuthResult, TokenResponse

Complete API:
  public abstract void onFlowInfo(String var1, String var2, String var3, int var4)
