---
title: "WorldPregenerateSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.system"
fqcn: "com.hypixel.hytale.server.core.universe.world.system.WorldPregenerateSystem"
api_surface: false
extends: "StoreSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.system`

```java
public class WorldPregenerateSystem extends StoreSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Set<Dependency<ChunkStore>>` | `DEPENDENCIES` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Set<Dependency<ChunkStore>>` | `getDependencies()` |
| `@Override public` | `void` | `onSystemAddedToStore(Store<ChunkStore> store)` |
| `@Override public` | `void` | `onSystemRemovedFromStore(Store<ChunkStore> store)` |
