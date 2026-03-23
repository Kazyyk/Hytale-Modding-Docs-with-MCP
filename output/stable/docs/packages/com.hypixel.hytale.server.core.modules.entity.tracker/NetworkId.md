---
title: "NetworkId"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.tracker"
fqcn: "com.hypixel.hytale.server.core.modules.entity.tracker.NetworkId"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "tracker"
  - "component"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.tracker`

```java
public final class NetworkId implements Component<EntityStore>
```

An ECS component that assigns an immutable integer network identifier to an entity. This ID is used by the entity tracker networking layer to reference entities in network packets (e.g., `EntityUpdates`). The ID is set at construction time and cannot be changed afterward.

The component type is registered by `EntityModule` and retrieved via the static `getComponentType()` accessor.

## Component Type Accessor

```java
@Nonnull
public static ComponentType<EntityStore, NetworkId> getComponentType()
```

Returns the registered component type, delegating to `EntityModule.get().getNetworkIdComponentType()`.

## Constructor

```java
public NetworkId(int id)
```

Creates a new `NetworkId` with the given integer identifier.

## Methods

```java
public int getId()
```

Returns the network identifier assigned at construction.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns `this` -- the component is immutable, so cloning returns the same instance.

## Related Types

- [EntityTrackerSystems](EntityTrackerSystems.md) -- the `SendPackets` system reads `NetworkId` to assign network IDs in outbound packets
- `EntityModule` -- registers the `NetworkId` component type
- `EntityStore` -- the ECS store this component belongs to
