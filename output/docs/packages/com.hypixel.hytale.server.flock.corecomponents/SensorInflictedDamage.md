---
title: "SensorInflictedDamage"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.SensorInflictedDamage"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents`

```java
public class SensorInflictedDamage extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `SensorInflictedDamage.Target` | `target` |
| `protected final` | `boolean` | `friendlyFire` |
| `protected final` | `EntityPositionProvider` | `positionProvider` |
| `private final` | `String` | `description` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
| `protected static` | `boolean` | `inSameFlock(@Nonnull Ref<EntityStore> selfReference, @Nonnull Ref<EntityStore> target, @Nonnull Store<EntityStore> store)` |
| `public` | `String` | `get()` |

## Inner Types

- `SensorInflictedDamage.Target`
