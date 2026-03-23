---
title: "com.hypixel.hytale.protocol.packets.auth"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "auth"
---

**Package:** `com.hypixel.hytale.protocol.packets.auth`

Authentication-related network packets for the Hytale client-server protocol. Handles authorization grants, token exchange, password challenges, connection acceptance, server referrals, and connection status reporting.

## Types

| Type | Kind | Description |
|---|---|---|
| [AuthGrant](AuthGrant.md) | class | Server-to-client packet (ID 11) carrying an authorization grant string and server identity token. |
| [AuthToken](AuthToken.md) | class | Client-to-server packet (ID 12) carrying an access token and server authorization grant. |
| [ClientReferral](ClientReferral.md) | class | Server-to-client packet (ID 18) instructing the client to connect to a different server. |
| [ConnectAccept](ConnectAccept.md) | class | Server-to-client packet (ID 14) indicating the connection was accepted. |
| [PasswordAccepted](PasswordAccepted.md) | class | Server-to-client packet (ID 16) confirming a password was accepted. |
| [PasswordRejected](PasswordRejected.md) | class | Server-to-client packet (ID 17) indicating a password was rejected. |
| [PasswordResponse](PasswordResponse.md) | class | Client-to-server packet (ID 15) containing the password response byte array sent in reply to a challenge. |
| [ServerAuthToken](ServerAuthToken.md) | class | Server-to-client packet (ID 13) carrying a server authentication token string. |
| [Status](Status.md) | class | Server-to-client packet (ID 19) carrying a status code integer. |
