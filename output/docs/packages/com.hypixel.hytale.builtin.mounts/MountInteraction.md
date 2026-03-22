---
title: "MountInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.interactions"
fqcn: "com.hypixel.hytale.builtin.mounts.interactions.MountInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.interactions`

```java
public class MountInteraction extends SimpleInstantInteraction
```

An entity interaction that mounts the interacting player onto a target entity. Registered on `Interaction.CODEC` with the key `"Mount"` by [MountPlugin](MountPlugin.md).

## Codec

```java
public static final BuilderCodec<MountInteraction> CODEC
```

Extends `SimpleInstantInteraction.CODEC` with:
- `AttachmentOffset` (`Vector3f`) -- position offset from the mount point. Defaults to `(0, 0, 0)`.
- `Controller` (`MountController` enum) -- the mount controller type. Required (validated non-null).

## Behavior

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

1. If no target entity exists, sets state to `Failed`.
2. If the player already has a [MountedComponent](MountedComponent.md), removes it (dismounts) and sets state to `Failed`.
3. If the target already has passengers (non-empty [MountedByComponent](MountedByComponent.md)), sets state to `Failed`.
4. Otherwise, adds a `MountedComponent` to the player targeting the entity with the configured attachment offset and controller.

## Related Types

- [MountPlugin](MountPlugin.md) -- registers this interaction
- [MountedComponent](MountedComponent.md) -- created by this interaction
- [MountedByComponent](MountedByComponent.md) -- checked for existing passengers
