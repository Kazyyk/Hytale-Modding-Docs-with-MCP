# DeviceAuthResponse

Type: record | Package: com.hypixel.hytale.server.core.auth.oauth

public record DeviceAuthResponse(String deviceCode, String userCode, String verificationUri, String verificationUriComplete, int expiresIn, int interval)

Part of the Hytale server authentication system.
