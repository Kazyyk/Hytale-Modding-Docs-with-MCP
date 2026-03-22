---
title: "SpawnReference"
kind: "class"
package: "com.hypixel.hytale.server.npc.components"
fqcn: "com.hypixel.hytale.server.npc.components.SpawnReference"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components`

```java
public abstract class SpawnReference implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `BuilderCodec<SpawnReference>` | `BASE_CODEC` |
| `public static final` | `float` | `MARKER_LOST_TIMEOUT` |
| `protected` | `InvalidatablePersistentRef` | `reference` |
| `private` | `float` | `markerLostTimeoutCounter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `InvalidatablePersistentRef` | `getReference()` |
| `public` | `boolean` | `tickMarkerLostTimeoutCounter(float dt)` |
| `public` | `void` | `refreshTimeoutCounter()` |
| `@Override public abstract` | `Component<EntityStore>` | `clone()` |
