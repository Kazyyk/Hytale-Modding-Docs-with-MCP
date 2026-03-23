---
title: "ApplyRandomSkinPersistedComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.ApplyRandomSkinPersistedComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "component"
  - "skin"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class ApplyRandomSkinPersistedComponent implements Component<EntityStore>
```

A singleton ECS component that flags a player entity for random skin assignment on persist. The component carries no data; its presence on an entity triggers the random skin behavior.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `INSTANCE` | `ApplyRandomSkinPersistedComponent` | Singleton instance returned by the codec. |
| `CODEC` | `BuilderCodec<ApplyRandomSkinPersistedComponent>` | Serialization codec that always deserializes to `INSTANCE`. |

## Static Methods

```java
public static ComponentType<EntityStore, ApplyRandomSkinPersistedComponent> getComponentType()
```

Returns the component type, retrieved from `EntityModule.get().getApplyRandomSkinPersistedComponent()`.

## Methods

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns `this` since the component is a stateless singleton.

## Related Types

- [PlayerSkinComponent](PlayerSkinComponent.md) -- holds the actual player skin data
