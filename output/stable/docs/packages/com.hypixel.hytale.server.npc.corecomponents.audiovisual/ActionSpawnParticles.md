---
title: "ActionSpawnParticles"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.ActionSpawnParticles"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "audiovisual"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.audiovisual`

```java
public class ActionSpawnParticles extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `String` | `particleSystem` |
| `protected final` | `double` | `range` |
| `protected final` | `Vector3d` | `offset` |
| `protected final` | `ModelParticle[]` | `modelParticlesProtocol` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionSpawnParticles(@Nonnull BuilderActionSpawnParticles builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
