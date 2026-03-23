---
title: "SetNameRespawnPointPage"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.respawn"
fqcn: "com.hypixel.hytale.builtin.beds.respawn.SetNameRespawnPointPage"
api_surface: false
extends: "RespawnPointPage"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "beds"
---
**Package:** `com.hypixel.hytale.builtin.beds.respawn`

```java
public class SetNameRespawnPointPage extends RespawnPointPage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Vector3i` | `respawnBlockPosition` |
| `private final` | `RespawnBlock` | `respawnBlock` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `SetNameRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnBlockPosition, @Nonnull RespawnBlock respawnBlock )` |
| `public` | `void` | `build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)` |
