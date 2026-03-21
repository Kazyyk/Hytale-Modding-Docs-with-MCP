---
title: "PlayerStorage"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.playerdata"
fqcn: "com.hypixel.hytale.server.core.universe.playerdata.PlayerStorage"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "universe"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.universe.playerdata`

```java
public interface PlayerStorage
```

Asynchronous interface for persisting and loading player entity data. All operations return `CompletableFuture` for non-blocking I/O. Implementations include `DiskPlayerStorageProvider` for file-backed storage and `DefaultPlayerStorageProvider`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `load(@Nonnull UUID var1)` | `CompletableFuture<Holder<EntityStore>>` | Loads the entity data for the given player UUID. |
| `save(@Nonnull UUID var1, @Nonnull Holder<EntityStore> var2)` | `CompletableFuture<Void>` | Saves entity data for the given player UUID. |
| `remove(@Nonnull UUID var1)` | `CompletableFuture<Void>` | Removes stored data for the given player UUID. |
| `getPlayers()` | `Set<UUID>` | Returns the set of all stored player UUIDs. Throws `IOException` on I/O failure. |
