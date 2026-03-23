---
title: "DamageModule.OrderGatherFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageModule.OrderGatherFilter"
api_surface: false
extends: ~
implements:
  - "ISystem<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageModule.OrderGatherFilter implements ISystem<EntityStore>
```

Deprecated ordering system that establishes the dependency relationship between the gather damage group and the filter damage group. Ensures gather systems execute before filter systems. This is a no-op system that exists solely for its dependency declarations.

## Methods

```java
@Nonnull
@Override
public Set<Dependency<EntityStore>> getDependencies()
```

Returns dependencies declaring this system runs AFTER the gather group and BEFORE the filter group.

## Related Types

- [DamageModule](DamageModule.md) -- parent class that registers this system
