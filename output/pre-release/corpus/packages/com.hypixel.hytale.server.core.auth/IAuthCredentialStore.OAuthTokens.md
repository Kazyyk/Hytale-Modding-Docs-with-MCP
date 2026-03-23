# OAuthTokens

Type: record | Package: com.hypixel.hytale.server.core.auth

public record OAuthTokens(@Nullable String accessToken, @Nullable String refreshToken, @Nullable Instant accessTokenExpiresAt)

Part of the Hytale server authentication system.
