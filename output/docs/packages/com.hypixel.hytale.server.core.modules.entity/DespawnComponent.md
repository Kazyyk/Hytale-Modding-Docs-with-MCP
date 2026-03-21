---
title: "DespawnComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.DespawnComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class DespawnComponent implements Component<EntityStore>
```

An ECS component that schedules an entity for automatic removal at a specific point in time. When attached to an entity, [DespawnSystem](DespawnSystem.md) checks each tick whether the current server time has passed the despawn instant and, if so, removes the entity.

The component is serialized via a `BuilderCodec` with the JSON key `"Despawn"` storing the target `Instant`.

## Codec

```java
public static final BuilderCodec<DespawnComponent> CODEC
```

Serializes the `timeToDespawnAt` instant under the `"Despawn"` key using `Codec.INSTANT`.

## Static Methods

```java
public static ComponentType<EntityStore, DespawnComponent> getComponentType()
```

Returns the component type, delegating to `EntityModule.get().getDespawnComponentType()`.

```java
@Nonnull
public static DespawnComponent despawnInSeconds(@Nonnull TimeResource time, int seconds)
```

Factory method that creates a component set to despawn the given number of whole seconds from the current time.

```java
@Nonnull
public static DespawnComponent despawnInSeconds(@Nonnull TimeResource time, float seconds)
```

Factory method that creates a component set to despawn the given fractional number of seconds from the current time. Converts seconds to nanoseconds for precision.

```java
@Nonnull
public static DespawnComponent despawnInMilliseconds(@Nonnull TimeResource time, long milliseconds)
```

Factory method that creates a component set to despawn the given number of milliseconds from the current time.

```java
public static void trySetDespawn(
    @Nonnull CommandBuffer<EntityStore> commandBuffer,
    @Nonnull TimeResource timeResource,
    @Nonnull Ref<EntityStore> ref,
    @Nullable DespawnComponent despawnComponent,
    @Nullable Float newLifetime
)
```

Convenience method that updates an entity's despawn schedule. Behavior depends on the current state:

- If the entity already has a `DespawnComponent` and `newLifetime` is non-null, updates the despawn time.
- If the entity already has a `DespawnComponent` and `newLifetime` is null, removes the component.
- If the entity lacks a `DespawnComponent` and `newLifetime` is non-null, creates and attaches one.

## Constructors

```java
public DespawnComponent()
```

Default constructor with no despawn time set.

```java
public DespawnComponent(@Nullable Instant timeToDespawnAt)
```

Constructs a component with the specified despawn instant.

## Methods

```java
public void setDespawn(Instant timeToDespawnAt)
```

Sets the despawn instant directly.

```java
public void setDespawnTo(@Nonnull Instant from, float additionalSeconds)
```

Sets the despawn instant to `from` plus the given number of seconds (converted to nanoseconds).

```java
@Nullable
public Instant getDespawn()
```

Returns the scheduled despawn instant, or `null` if none is set.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a new `DespawnComponent` with the same `timeToDespawnAt` value.

## Related Types

- [DespawnSystem](DespawnSystem.md) -- the ticking system that removes entities past their despawn time
- [EntityModule](EntityModule.md) -- registers this component type under the key `"Despawn"`
- `TimeResource` -- provides the current server time used by factory methods
- `Component` -- the ECS component interface
