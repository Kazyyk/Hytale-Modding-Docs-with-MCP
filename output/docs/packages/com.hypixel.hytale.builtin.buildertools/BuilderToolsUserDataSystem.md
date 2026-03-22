---
title: "BuilderToolsUserDataSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsUserDataSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class BuilderToolsUserDataSystem extends HolderSystem<EntityStore>
```

An `EntityStore` holder system that ensures every player entity has a [BuilderToolsUserData](BuilderToolsUserData.md) component. Registered during [BuilderToolsPlugin](BuilderToolsPlugin.md) setup.

## Query

```java
@Nonnull
@Override
public Query<EntityStore> getQuery()
```

Returns a compound query matching entities that have a `Player` component but do **not** have a `BuilderToolsUserData` component: `Query.and(Player.getComponentType(), Query.not(BuilderToolsUserData.getComponentType()))`.

## Lifecycle Callbacks

### onEntityAdd

```java
@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
```

Ensures the `BuilderToolsUserData` component exists on the entity by calling `holder.ensureComponent(BuilderToolsUserData.getComponentType())`.

### onEntityRemoved

```java
@Override
public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
```

No-op implementation. The component is not removed on entity removal.

## Related Types

- [BuilderToolsUserData](BuilderToolsUserData.md) -- the component this system ensures
- [BuilderToolsSystems.EnsureBuilderTools](BuilderToolsSystems.EnsureBuilderTools.md) -- companion system that ensures builder tool items
- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- registers this system during setup
