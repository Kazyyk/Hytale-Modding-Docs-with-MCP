---
title: "PacketHandler.DisconnectReason"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.PacketHandler.DisconnectReason"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public static class PacketHandler.DisconnectReason
```

Tracks the reason a connection was terminated, either from a server-initiated disconnect (with a `FormattedMessage`) or a client-initiated disconnect (with a `DisconnectType`). Setting one clears the other.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getServerDisconnectReason()` |
| `public` | `FormattedMessage` | `getServerDisconnectReasonFormatted()` |
| `public` | `void` | `setServerDisconnectReason(FormattedMessage serverDisconnectReason)` |
| `public` | `DisconnectType` | `getClientDisconnectType()` |
| `public` | `void` | `setClientDisconnectType(DisconnectType clientDisconnectType)` |
| `public` | `String` | `toString()` |

## Relationships

- Inner class of [PacketHandler](PacketHandler.md)
