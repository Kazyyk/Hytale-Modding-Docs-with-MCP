---
title: "EncryptedAuthCredentialStore"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.EncryptedAuthCredentialStore"
api_surface: false
extends: ~
implements: ["IAuthCredentialStore"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "credentials"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class EncryptedAuthCredentialStore implements IAuthCredentialStore
```

Credential store that persists OAuth tokens to disk using AES-256-GCM encryption. The encryption key is derived from the hardware UUID via PBKDF2WithHmacSHA256 with 100,000 iterations. Falls back to non-persistent storage if the hardware UUID is unavailable.

## Constants

| Constant | Value |
|---|---|
| `ALGORITHM` | `"AES/GCM/NoPadding"` |
| `GCM_IV_LENGTH` | 12 |
| `GCM_TAG_LENGTH` | 128 |
| `KEY_LENGTH` | 256 |
| `PBKDF2_ITERATIONS` | 100,000 |

## Constructor

```java
public EncryptedAuthCredentialStore(@Nonnull Path path)
```

Constructs the store with the given file path. Derives the encryption key from the hardware UUID and loads any existing credentials from disk.

## Methods

Implements all methods from [IAuthCredentialStore](IAuthCredentialStore.md). Each `setTokens()` and `setProfile()` call triggers an immediate encrypted save to disk. `clear()` deletes the credentials file.

## Inner Types

- [StoredCredentials](EncryptedAuthCredentialStore.StoredCredentials.md) -- internal DTO for serialized credential data
