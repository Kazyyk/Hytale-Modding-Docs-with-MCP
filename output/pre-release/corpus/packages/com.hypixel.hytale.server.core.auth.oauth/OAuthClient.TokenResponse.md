# TokenResponse

Type: record | Package: com.hypixel.hytale.server.core.auth.oauth

public record TokenResponse(@Nullable String accessToken, @Nullable String refreshToken, @Nullable String idToken, @Nullable String error, int expiresIn)

Part of the Hytale server authentication system.
