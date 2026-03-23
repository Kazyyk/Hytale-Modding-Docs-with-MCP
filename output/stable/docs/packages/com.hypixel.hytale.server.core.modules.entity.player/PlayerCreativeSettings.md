---
title: "PlayerCreativeSettings"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerCreativeSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "creative"
  - "settings"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public record PlayerCreativeSettings(boolean allowNPCDetection, boolean respondToHit)
```

A record holding player-specific creative mode settings. Used as a nested value within [PlayerSettings](PlayerSettings.md).

## Record Components

| Component | Type | Description |
|---|---|---|
| `allowNPCDetection` | `boolean` | Whether NPCs can detect this player in creative mode. |
| `respondToHit` | `boolean` | Whether the player responds to hit events in creative mode. |

## Constructors

```java
public PlayerCreativeSettings()
```

Default constructor: `allowNPCDetection = false`, `respondToHit = false`.

## Methods

```java
@Nonnull
public PlayerCreativeSettings clone()
```

Returns a copy of this record.

## Related Types

- [PlayerSettings](PlayerSettings.md) -- parent settings record that contains this
