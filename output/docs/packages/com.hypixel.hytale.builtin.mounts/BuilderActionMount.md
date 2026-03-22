---
title: "BuilderActionMount"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.npc.builders"
fqcn: "com.hypixel.hytale.builtin.mounts.npc.builders.BuilderActionMount"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.npc.builders`

```java
public class BuilderActionMount extends BuilderActionBase
```

Builder and JSON configuration reader for [ActionMount](ActionMount.md) NPC action definitions. Reads anchor offsets and movement config from JSON data and builds an `ActionMount` instance.

## Fields

| Field | Type | Description |
|---|---|---|
| `anchorX` | `FloatHolder` | X anchor position holder. |
| `anchorY` | `FloatHolder` | Y anchor position holder. |
| `anchorZ` | `FloatHolder` | Z anchor position holder. |
| `movementConfig` | `StringHolder` | Movement config asset ID holder. |

## Methods

### getShortDescription

```java
@Nonnull
@Override
public String getShortDescription()
```

Returns `"Enable the player to mount the entity"`.

### getLongDescription

```java
@Nonnull
@Override
public String getLongDescription()
```

Returns the same as `getShortDescription()`.

### getBuilderDescriptorState

```java
@Nonnull
@Override
public BuilderDescriptorState getBuilderDescriptorState()
```

Returns `BuilderDescriptorState.Stable`.

### Accessor Methods

| Method | Description |
|---|---|
| `getAnchorX(BuilderSupport support)` | Returns the X anchor from the execution context. |
| `getAnchorY(BuilderSupport support)` | Returns the Y anchor from the execution context. |
| `getAnchorZ(BuilderSupport support)` | Returns the Z anchor from the execution context. |
| `getMovementConfig(BuilderSupport support)` | Returns the movement config ID from the execution context. |

### build

```java
@Nonnull
public ActionMount build(@Nonnull BuilderSupport builderSupport)
```

Creates an [ActionMount](ActionMount.md) from this builder's configuration.

### readConfig

```java
@Override
public Builder<Action> readConfig(@Nonnull JsonElement data)
```

Reads four required fields from JSON:
- `AnchorX` (float, Stable) -- "The X anchor pos"
- `AnchorY` (float, Stable) -- "The Y anchor pos"
- `AnchorZ` (float, Stable) -- "The Z anchor pos"
- `MovementConfig` (string, Stable) -- "The MovementConfig to use for this mount"

## Related Types

- [ActionMount](ActionMount.md) -- the action built by this builder
- [MountPlugin](MountPlugin.md) -- registers this builder as the `"Mount"` core component type
