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

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, CertificateUtil, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  private static String validateJwtStructure(String token, String tokenType)
  public JWTValidator.JWTClaims validateToken(String accessToken, X509Certificate clientCert)
  private boolean verifySignature(SignedJWT signedJWT, JWKSet jwkSet)
  private JWKSet getJwkSet()
  private JWKSet getJwkSet(boolean forceRefresh)
  private JWKSet fetchJwksFromService()
  private boolean verifySignatureWithRetry(SignedJWT signedJWT)
  private boolean canForceRefreshJwks()
  private JWK convertToJWK(SessionServiceClient.JwkKey key)
  private void preSeedJwksCache()
  private JWKSet loadEmbeddedJwks()
  private JWKSet loadJwksCacheFromDisk()
  private void saveJwksCacheToDisk(JWKSet jwkSet)
  public JWTValidator.IdentityTokenClaims validateOfflineToken(String offlineToken)
  public void invalidateJwksCache()
  public JWTValidator.IdentityTokenClaims validateIdentityToken(String identityToken)
  public JWTValidator.SessionTokenClaims validateSessionToken(String sessionToken)

Fields:
private static final HytaleLogger LOGGER
private static final long CLOCK_SKEW_SECONDS
private static final JWSAlgorithm SUPPORTED_ALGORITHM
private static final int MIN_SIGNATURE_LENGTH
private static final int MAX_SIGNATURE_LENGTH
private static final Duration JWKS_REFRESH_MIN_INTERVAL
private static final String JWKS_BUNDLED_RESOURCE
private static final String JWKS_CACHE_FILE
private final SessionServiceClient sessionServiceClient
private final String expectedIssuer
private final String expectedAudience
private volatile JWKSet cachedJwkSet
private final ReentrantLock jwksFetchLock
private volatile CompletableFuture<JWKSet> pendingFetch
private volatile Instant lastJwksRefresh
