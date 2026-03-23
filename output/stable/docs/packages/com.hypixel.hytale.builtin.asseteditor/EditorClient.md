---
title: "EditorClient"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.EditorClient"
api_surface: false
extends: null
implements:
  - "PermissionHolder"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class EditorClient implements PermissionHolder
```

Represents a connected asset editor session. Wraps the client's identity (UUID, username), language preference, authentication credentials, and packet handler. Provides convenience methods for sending popup notifications and success/failure replies.

## Constructors

```java
public EditorClient(String language, PlayerAuthentication auth, PacketHandler packetHandler)
```

```java
public EditorClient(String language, UUID uuid, String username, PacketHandler packetHandler)
```

```java
@Deprecated
public EditorClient(PlayerRef playerRef)
```

The deprecated constructor creates a mock client from a `PlayerRef`, used for legacy in-game JSON update handling.

## Key Methods

| Method | Returns | Description |
|---|---|---|
| `getLanguage()` | `String` | Client's language code |
| `setLanguage(String)` | `void` | Updates the language |
| `getUuid()` | `UUID` | Player UUID |
| `getUsername()` | `String` | Player username |
| `getAuth()` | `PlayerAuthentication` | Authentication info (nullable) |
| `getPacketHandler()` | `PacketHandler` | Underlying network handler |
| `tryGetPlayer()` | `PlayerRef` | Resolves the player from `Universe.get()` (nullable) |
| `hasPermission(String)` | `boolean` | Delegates to `PermissionsModule` |
| `hasPermission(String, boolean)` | `boolean` | Delegates to `PermissionsModule` with default |
| `sendPopupNotification(AssetEditorPopupNotificationType, Message)` | `void` | Sends a popup notification to the editor UI |
| `sendSuccessReply(int)` | `void` | Sends a success reply for a token |
| `sendSuccessReply(int, Message)` | `void` | Sends a success reply with a message |
| `sendFailureReply(int, Message)` | `void` | Sends a failure reply with a message |
