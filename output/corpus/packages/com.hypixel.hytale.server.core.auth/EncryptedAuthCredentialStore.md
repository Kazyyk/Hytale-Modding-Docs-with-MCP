# EncryptedAuthCredentialStore

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: IAuthCredentialStore

public class EncryptedAuthCredentialStore implements IAuthCredentialStore

Credential store that persists OAuth tokens to disk using AES-256-GCM encryption. The encryption key is derived from the hardware UUID via PBKDF2WithHmacSHA256 with 100,000 iterations. Falls back to non-persistent storage if the hardware UUID is unavailable.

## Constants

- ALGORITHM | "AES/GCM/NoPadding"
- GCM_IV_LENGTH | 12
- GCM_TAG_LENGTH | 128
- KEY_LENGTH | 256
- PBKDF2_ITERATIONS | 100,000

## Constructor


public EncryptedAuthCredentialStore(@Nonnull Path path)

Constructs the store with the given file path. Derives the encryption key from the hardware UUID and loads any existing credentials from disk.

## Methods

Implements all methods from IAuthCredentialStore. Each `setTokens()` and `setProfile()` call triggers an immediate encrypted save to disk. `clear()` deletes the credentials file.

## Inner Types

- StoredCredentials -- internal DTO for serialized credential data
