---
title: "PlayerCondition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.PlayerCondition"
api_surface: false
extends: "Condition"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset.condition`

```java
public class PlayerCondition extends Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `GameMode` | `gameModeToCheck` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `PlayerCondition()` |
| `public` | `boolean` | `eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)` |
| `public` | `String` | `toString()` |
