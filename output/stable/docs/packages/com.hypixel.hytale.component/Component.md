---
title: "Component"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Component"
api_surface: true
extends: "Cloneable"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public interface Component<ECS_TYPE> extends Cloneable
```

The root interface for all ECS components. Every piece of per-entity data in the ECS framework implements this interface. Components are stored in [ArchetypeChunk](ArchetypeChunk.md) arrays and accessed via [ComponentType](ComponentType.md) handles.

Components must be cloneable because the ECS serialization, entity copying, and archetype migration operations all require deep copies of component data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter (e.g., `EntityStore` or `ChunkStore`)

## Fields

```java
@Nonnull
Component[] EMPTY_ARRAY = new Component[0];
```

Shared empty array constant used as a default when no components are present.

## Methods

```java
@Nullable
Component<ECS_TYPE> clone();
```

Creates a deep copy of this component. Returns `null` if the component cannot be cloned.

```java
@Nullable
default Component<ECS_TYPE> cloneSerializable()
```

Creates a copy containing only serializable state. Defaults to calling `clone()`. Override this when a component contains transient runtime data that should be excluded from persistence.

## Related Types

- [ComponentType](ComponentType.md) -- typed handle used to register and access components in the ECS
- [ArchetypeChunk](ArchetypeChunk.md) -- stores component arrays for entities sharing the same archetype
- [Store](Store.md) -- the ECS store that manages entities and their components
- [Resource](Resource.md) -- the equivalent interface for per-store singleton data
