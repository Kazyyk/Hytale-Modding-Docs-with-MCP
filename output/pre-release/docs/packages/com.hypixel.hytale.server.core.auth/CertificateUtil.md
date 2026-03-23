---
title: "CertificateUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.CertificateUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "security"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class CertificateUtil
```

Utility class for X.509 certificate operations used in mTLS authentication. Provides SHA-256 fingerprint computation, certificate-to-JWT binding validation, and timing-safe string comparison.

## Methods

```java
@Nullable
public static String computeCertificateFingerprint(@Nonnull X509Certificate certificate)
```

Computes the SHA-256 fingerprint of the certificate encoded as base64url (no padding). Returns `null` if the algorithm is unavailable or encoding fails.

```java
public static boolean validateCertificateBinding(@Nullable String jwtFingerprint, @Nullable X509Certificate clientCert)
```

Validates that the JWT's `cnf.x5t#S256` fingerprint matches the client certificate presented via mTLS. Returns `false` if either parameter is null or the fingerprints do not match.

```java
public static boolean timingSafeEquals(String a, String b)
```

Performs a timing-safe comparison of two strings using `MessageDigest.isEqual`. Returns `true` if both are null or both have identical byte content.
