# JWTValidator

Type: class | Package: com.hypixel.hytale.server.core.auth

public class JWTValidator

Validates JSON Web Tokens (JWTs) using Ed25519 (EdDSA) signature verification with JWKS key rotation support. Verifies access tokens, identity tokens, and session tokens against expected issuer/audience claims, temporal validity (with 300-second clock skew tolerance), and mTLS certificate binding.

## Constants

- CLOCK_SKEW_SECONDS | 300
- SUPPORTED_ALGORITHM | EdDSA
- MIN_SIGNATURE_LENGTH | 80
- MAX_SIGNATURE_LENGTH | 90
- JWKS_REFRESH_MIN_INTERVAL | 5 minutes

## Constructor


public JWTValidator(@Nonnull SessionServiceClient sessionServiceClient, @Nonnull String expectedIssuer, @Nonnull String expectedAudience)

## Methods


@Nullable
public JWTValidator.JWTClaims validateToken(@Nonnull String accessToken, @Nullable X509Certificate clientCert)

Validates an access token. Checks JWT structure, EdDSA signature (with JWKS retry on failure), issuer, audience, temporal claims, mTLS certificate binding, and subject UUID validity. Returns parsed claims on success, `null` on any validation failure.


@Nullable
public JWTValidator.IdentityTokenClaims validateIdentityToken(@Nonnull String identityToken)

Validates an identity token. Checks structure, signature, issuer, temporal claims, and subject UUID. Extracts profile data (username, skin, entitlements) from the `profile` claim.


@Nullable
public JWTValidator.SessionTokenClaims validateSessionToken(@Nonnull String sessionToken)

Validates a session token. Checks structure, signature, issuer, temporal claims, and subject UUID.


public void invalidateJwksCache()

Clears the cached JWKS key set, forcing a fresh fetch on the next validation.

## Inner Types

- JWTClaims -- parsed access token claims
- IdentityTokenClaims -- parsed identity token claims
- SessionTokenClaims -- parsed session token claims
