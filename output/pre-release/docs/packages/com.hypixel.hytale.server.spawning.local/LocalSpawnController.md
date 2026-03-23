---
title: "LocalSpawnController"
kind: "class"
package: "com.hypixel.hytale.server.spawning.local"
fqcn: "com.hypixel.hytale.server.spawning.local.LocalSpawnController"
api_surface: false
extends: "Component<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "local"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.local`

```java
public class LocalSpawnController implements Component<EntityStore>
```

Component attached to player entities that tracks the countdown to the next local spawn controller run. Ticks down a timer and signals when a spawn check should occur.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, LocalSpawnController>` | `getComponentType()` |
| `public` | `void` | `setTimeToNextRunSeconds(double seconds)` |
| `public` | `boolean` | `tickTimeToNextRunSeconds(float dt)` |
