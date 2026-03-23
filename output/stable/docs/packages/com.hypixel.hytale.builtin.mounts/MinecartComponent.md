---
title: "MinecartComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.minecart"
fqcn: "com.hypixel.hytale.builtin.mounts.minecart.MinecartComponent"
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

**Package:** `com.hypixel.hytale.builtin.mounts.minecart`

```java
public class MinecartComponent implements Component<EntityStore>
```

An `EntityStore` ECS component representing a minecart entity's state. Tracks the number of hits received (for destruction after 3 hits), the timestamp of the last hit (with a 10-second reset window), and the source item ID used to drop an item when destroyed in survival mode.

Serialized with codec key `"Minecart"` and a `BuilderCodec` that persists the `SourceItem` field.

## Component Type

```java
public static ComponentType<EntityStore, MinecartComponent> getComponentType()
```

Delegates to `MountPlugin.getInstance().getMinecartComponentType()`.

## Codec

```java
public static final BuilderCodec<MinecartComponent> CODEC
```

Serializes/deserializes the `SourceItem` field as a string. Defaults to `"Rail_Kart"`.

## Constructors

```java
private MinecartComponent()
```

Default constructor for codec deserialization.

```java
public MinecartComponent(String sourceItem)
```

Creates a minecart component with the specified source item ID.

## Accessors and Mutators

| Method | Returns | Description |
|---|---|---|
| `getNumberOfHits()` | `int` | Current hit count (resets after 10 seconds of no hits). |
| `setNumberOfHits(int numberOfHits)` | `void` | Sets the hit count. |
| `getLastHit()` | `@Nullable Instant` | Timestamp of the last hit, or `null` if never hit. |
| `setLastHit(@Nullable Instant lastHit)` | `void` | Sets the last hit timestamp. |
| `getSourceItem()` | `String` | The item ID to drop when destroyed (default: `"Rail_Kart"`). |
| `setSourceItem(String sourceItem)` | `void` | Sets the source item ID. |

## Clone

```java
@Override
public Component<EntityStore> clone()
```

Returns a new `MinecartComponent` with the same source item. Hit count and last hit are not copied.

## Related Types

- [MountSystems.OnMinecartHit](MountSystems.OnMinecartHit.md) -- handles damage and destruction
- [MountSystems.EnsureMinecartComponents](MountSystems.EnsureMinecartComponents.md) -- ensures supporting components on minecart entities
- [SpawnMinecartInteraction](SpawnMinecartInteraction.md) -- creates minecart entities with this component
