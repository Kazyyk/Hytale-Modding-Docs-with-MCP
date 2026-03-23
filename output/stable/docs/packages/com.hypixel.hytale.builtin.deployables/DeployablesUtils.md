---
title: "DeployablesUtils"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables"
fqcn: "com.hypixel.hytale.builtin.deployables.DeployablesUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables`

```java
public class DeployablesUtils
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `String` | `DEPLOYABLE_MAX_STAT_MODIFIER` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `Ref<EntityStore>` | `spawnDeployable(@Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull Store<EntityStore> store,
        @Nonnull DeployableConfig config,
        @Nonnull Ref<EntityStore> deployerRef,
        @Nonnull Vector3f position,
        @Nonnull Vector3f rotation,
        @Nonnull String spawnFace)` |
| `static` | `void` | `populateStats(@Nonnull DeployableConfig config, @Nonnull EntityStatMap entityStatMapComponent)` |
| `public static` | `void` | `playAnimation(@Nonnull Store<EntityStore> store,
        int networkId,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull DeployableConfig config,
        @Nonnull AnimationSlot animationSlot,
        @Nullable String itemAnimationsId,
        @Nonnull String animationId)` |
| `public static` | `void` | `stopAnimation(@Nonnull Store<EntityStore> store, int networkId, @Nonnull Ref<EntityStore> ref, @Nonnull AnimationSlot animationSlot)` |
| `public static` | `void` | `playSoundEventsAtEntity(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, int localIndex, int worldIndex, @Nonnull Vector3d pos)` |
