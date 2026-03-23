---
title: "NPCMountComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class NPCMountComponent implements Component<EntityStore>
```

An `EntityStore` ECS component storing NPC-specific mount state. Tracks the NPC's original role index (to restore on dismount), the owning player reference, and the anchor position offset where the player attaches to the NPC.

Serialized with codec key `"Mount"` and a `BuilderCodec` that persists `OriginalRoleIndex`.

## Component Type

```java
public static ComponentType<EntityStore, NPCMountComponent> getComponentType()
```

Delegates to `MountPlugin.getInstance().getMountComponentType()`.

## Codec

```java
public static final BuilderCodec<NPCMountComponent> CODEC
```

Serializes/deserializes the `OriginalRoleIndex` field as an integer.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getOriginalRoleIndex()` | `int` | The NPC role index before mounting, used to restore the role on dismount. |
| `getOwnerPlayerRef()` | `@Nullable PlayerRef` | The player who mounted this NPC, or `null`. |
| `getAnchorX()` | `float` | X component of the player attachment offset. |
| `getAnchorY()` | `float` | Y component of the player attachment offset. |
| `getAnchorZ()` | `float` | Z component of the player attachment offset. |

## Mutators

| Method | Description |
|---|---|
| `setOriginalRoleIndex(int originalRoleIndex)` | Sets the original role index. |
| `setOwnerPlayerRef(PlayerRef ownerPlayerRef)` | Sets the owning player reference. |
| `setAnchor(float x, float y, float z)` | Sets the anchor attachment offset. |

## Clone

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a copy with all fields duplicated.

## Related Types

- [NPCMountSystems](NPCMountSystems.md) -- systems reacting to this component
- [ActionMount](ActionMount.md) -- NPC action that creates this component
- [MountPlugin](MountPlugin.md) -- registers this component type
