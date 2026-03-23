---
title: "CameraEffectSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.system"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.system.CameraEffectSystem"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.system`

```java
public class CameraEffectSystem extends DamageEventSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,PlayerRef>` | `playerRefComponentType` |
| `private final` | `ComponentType<EntityStore,EntityStatMap>` | `entityStatMapComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `SystemGroup<EntityStore>` | `getGroup()` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)` |
