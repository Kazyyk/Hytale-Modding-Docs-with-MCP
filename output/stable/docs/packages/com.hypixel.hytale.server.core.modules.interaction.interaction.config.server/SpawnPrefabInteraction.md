---
title: "SpawnPrefabInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.SpawnPrefabInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "prefab"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class SpawnPrefabInteraction extends SimpleInstantInteraction
```

Spawns a prefab at the current location. Supports two origin sources: `ENTITY` (entity position + offset) and `BLOCK` (target block position + rotated offset inheriting block rotation). Loads the prefab from the asset store and pastes it into the world with the configured rotation.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `PrefabPath` | `String` | No (inherited) | -- | File path of the prefab asset to spawn. |
| `Offset` | `Vector3i` | Yes (inherited) | `Vector3i.ZERO` | Positional offset from the origin. |
| `RotationYaw` | `Rotation` | Yes (inherited) | `Rotation.None` | Yaw rotation to apply to the prefab. |
| `OriginSource` | `OriginSource` enum | Yes (inherited) | `ENTITY` | Whether the origin is the entity's position or the target block's position. |
| `Force` | `boolean` | No (inherited) | `false` | Whether to force-paste the prefab (overwriting existing blocks). |

## Inner Enums

- `OriginSource` -- `ENTITY` or `BLOCK`

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Resolves the prefab path, loads the cached prefab buffer, determines the target position based on origin source, and calls `PrefabUtil.paste`.

## See Also

- `PrefabStore` -- resolves prefab asset paths
- `PrefabUtil` -- handles prefab pasting into the world
