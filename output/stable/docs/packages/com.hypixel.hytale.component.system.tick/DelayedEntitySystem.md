---
title: "DelayedEntitySystem"
kind: "class"
package: "com.hypixel.hytale.component.system.tick"
fqcn: "com.hypixel.hytale.component.system.tick.DelayedEntitySystem"
api_surface: false
extends: "EntityTickingSystem<ECS_TYPE>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "tick"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system.tick`

```java
public abstract class DelayedEntitySystem<ECS_TYPE> extends EntityTickingSystem<ECS_TYPE>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ResourceType<ECS_TYPE, DelayedEntitySystem.Data<ECS_TYPE>>` | `resourceType` |
| `private final` | `float` | `intervalSec` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DelayedEntitySystem(float intervalSec)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ResourceType<ECS_TYPE, DelayedEntitySystem.Data<ECS_TYPE>>` | `getResourceType()` |
| `public` | `float` | `getIntervalSec()` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)` |

## Inner Types

- `DelayedEntitySystem.Data`
