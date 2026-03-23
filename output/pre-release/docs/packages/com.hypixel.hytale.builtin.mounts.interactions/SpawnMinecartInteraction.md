---
title: "SpawnMinecartInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.interactions"
fqcn: "com.hypixel.hytale.builtin.mounts.interactions.SpawnMinecartInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "mounts"
  - "interactions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.mounts.interactions`

```java
public class SpawnMinecartInteraction extends SimpleBlockInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SpawnMinecartInteraction>` | `CODEC` |
| `private` | `String` | `modelId` |
| `private` | `Map<InteractionType, String>` | `cartInteractions` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i targetBlock,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
| `private static` | `void` | `alignToRail(@Nonnull Vector3i targetBlock, @Nonnull Vector3d target, @Nonnull Vector3f rotation, float yaw, @Nonnull RailConfig config)` |
