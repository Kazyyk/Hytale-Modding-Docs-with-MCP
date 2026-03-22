---
title: "DelayedSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.DelayedSystem"
api_surface: false
extends: "TickingSystem<ECS_TYPE>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class DelayedSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>>` | `resourceType` |
| `private final` | `float` | `intervalSec` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DelayedSystem(float intervalSec)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>>` | `getResourceType()` |
| `public` | `float` | `getIntervalSec()` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)` |
| `public abstract` | `void` | `delayedTick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)` |

## Inner Types

- `DelayedSystem.Data`
