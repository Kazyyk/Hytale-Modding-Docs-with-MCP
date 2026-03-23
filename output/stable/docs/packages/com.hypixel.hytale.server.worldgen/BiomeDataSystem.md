---
title: "BiomeDataSystem"
kind: "class"
package: "com.hypixel.hytale.server.worldgen"
fqcn: "com.hypixel.hytale.server.worldgen.BiomeDataSystem"
api_surface: false
extends: "DelayedEntitySystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.server.worldgen`

```java
public class BiomeDataSystem extends DelayedEntitySystem<EntityStore>
```

ECS system handling BiomeData tick processing.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BiomeDataSystem()` |
| `@Override public` | `void` | `tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Nullable @Override public` | `Query<EntityStore>` | `getQuery()` |
