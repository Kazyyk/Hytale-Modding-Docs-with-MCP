---
title: "com.hypixel.hytale.server.core.auth"
package: "com.hypixel.hytale.server.core.auth"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
---

**Package:** `com.hypixel.hytale.server.core.auth`

This package contains 29 types implementing the Hytale server authentication system. It includes OAuth 2.0 credential management, JWT validation with Ed25519/EdDSA signatures and JWKS key rotation, Session Service and Profile Service HTTP clients, encrypted credential persistence, and server-side authentication state management.

## Interfaces

| Type | Description |
|---|---|
| [AuthCredentialStoreProvider](AuthCredentialStoreProvider.md) |  |
| [IAuthCredentialStore](IAuthCredentialStore.md) |  |

## Records

| Type | Description |
|---|---|
| [IAuthCredentialStore.OAuthTokens](IAuthCredentialStore.OAuthTokens.md) |  |

## Enums

| Type | Description |
|---|---|
| [ServerAuthManager.AuthMode](ServerAuthManager.AuthMode.md) |  |
| [ServerAuthManager.AuthResult](ServerAuthManager.AuthResult.md) |  |

## Classes

| Type | Description |
|---|---|
| [AuthConfig](AuthConfig.md) |  |
| [AuthConfigGenerated](AuthConfigGenerated.md) |  |
| [CertificateUtil](CertificateUtil.md) |  |
| [DefaultAuthCredentialStore](DefaultAuthCredentialStore.md) |  |
| [EncryptedAuthCredentialStore](EncryptedAuthCredentialStore.md) |  |
| [EncryptedAuthCredentialStore.StoredCredentials](EncryptedAuthCredentialStore.StoredCredentials.md) |  |
| [EncryptedAuthCredentialStoreProvider](EncryptedAuthCredentialStoreProvider.md) |  |
| [JWTValidator](JWTValidator.md) |  |
| [JWTValidator.IdentityTokenClaims](JWTValidator.IdentityTokenClaims.md) |  |
| [JWTValidator.JWTClaims](JWTValidator.JWTClaims.md) |  |
| [JWTValidator.SessionTokenClaims](JWTValidator.SessionTokenClaims.md) |  |
| [MemoryAuthCredentialStoreProvider](MemoryAuthCredentialStoreProvider.md) |  |
| [PlayerAuthentication](PlayerAuthentication.md) | API |
| [ProfileServiceClient](ProfileServiceClient.md) |  |
| [ProfileServiceClient.PublicGameProfile](ProfileServiceClient.PublicGameProfile.md) |  |
| [ServerAuthManager](ServerAuthManager.md) |  |
| [SessionServiceClient](SessionServiceClient.md) |  |
| [SessionServiceClient.AccessTokenResponse](SessionServiceClient.AccessTokenResponse.md) |  |
| [SessionServiceClient.AuthGrantResponse](SessionServiceClient.AuthGrantResponse.md) |  |
| [SessionServiceClient.GameProfile](SessionServiceClient.GameProfile.md) |  |
| [SessionServiceClient.GameSessionResponse](SessionServiceClient.GameSessionResponse.md) |  |
| [SessionServiceClient.JwkKey](SessionServiceClient.JwkKey.md) |  |
| [SessionServiceClient.JwksResponse](SessionServiceClient.JwksResponse.md) |  |
| [SessionServiceClient.LauncherDataResponse](SessionServiceClient.LauncherDataResponse.md) |  |
