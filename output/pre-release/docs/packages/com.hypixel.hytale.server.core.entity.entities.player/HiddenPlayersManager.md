---
title: "HiddenPlayersManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.HiddenPlayersManager"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "player"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player`

```java
public class HiddenPlayersManager
```

Thread-safe manager for tracking which players are hidden from a given player. Uses a `ConcurrentHashMap`-backed set for concurrent access from multiple threads.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `hidePlayer(@Nonnull UUID uuid)` | `void` | Marks the specified player as hidden. |
| `showPlayer(@Nonnull UUID uuid)` | `void` | Removes the hidden status for the specified player. |
| `isPlayerHidden(@Nonnull UUID uuid)` | `boolean` | Returns true if the specified player is currently hidden. |
