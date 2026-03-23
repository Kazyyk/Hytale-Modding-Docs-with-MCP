# CertificateUtil

Type: class | Package: com.hypixel.hytale.server.core.auth

public class CertificateUtil

Utility class for X.509 certificate operations used in mTLS authentication. Provides SHA-256 fingerprint computation, certificate-to-JWT binding validation, and timing-safe string comparison.

## Methods


@Nullable
public static String computeCertificateFingerprint(@Nonnull X509Certificate certificate)

Computes the SHA-256 fingerprint of the certificate encoded as base64url (no padding). Returns `null` if the algorithm is unavailable or encoding fails.


public static boolean validateCertificateBinding(@Nullable String jwtFingerprint, @Nullable X509Certificate clientCert)

Validates that the JWT's `cnf.x5t#S256` fingerprint matches the client certificate presented via mTLS. Returns `false` if either parameter is null or the fingerprints do not match.


public static boolean timingSafeEquals(String a, String b)

Performs a timing-safe comparison of two strings using `MessageDigest.isEqual`. Returns `true` if both are null or both have identical byte content.

Also in this package: AccessTokenResponse, AuthConfig, AuthConfigGenerated, AuthCredentialStoreProvider, AuthGrantResponse, AuthMode, AuthResult, DefaultAuthCredentialStore, EncryptedAuthCredentialStore, EncryptedAuthCredentialStoreProvider, GameProfile, GameSessionResponse, HttpResponseException, IAuthCredentialStore, IdentityTokenClaims, JWTClaims, JWTValidator, JwkKey, JwksResponse, LauncherDataResponse (and 9 more)

Complete API:
  public static String computeCertificateFingerprint(X509Certificate certificate)
  public static boolean validateCertificateBinding(String jwtFingerprint, X509Certificate clientCert)
  public static boolean timingSafeEquals(String a, String b)
  private static String base64UrlEncode(byte[] input)

Fields:
private static final HytaleLogger LOGGER
