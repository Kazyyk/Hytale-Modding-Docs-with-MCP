---
title: "PrefabPathCollection"
kind: "class"
package: "com.hypixel.hytale.builtin.path"
fqcn: "com.hypixel.hytale.builtin.path.PrefabPathCollection"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "path"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.path`

```java
public class PrefabPathCollection
```

Collection of prefab paths within a single worldgen context. Stores paths by UUID and by friendly name index, supporting nearest-path lookup by position with optional exclusion sets.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `IPrefabPath` | `getNearestPrefabPath(int nameIndex, @Nonnull Vector3d position, Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `IPrefabPath` | `getPath(UUID id)` |
| `public` | `IPrefabPath` | `getOrConstructPath(@Nonnull UUID id, @Nonnull String name, @Nonnull IntBiObjFunction<UUID, String, IPrefabPath> pathGenerator)` |
| `@Nullable public` | `IPrefabPath` | `getNearestPrefabPath(@Nonnull Vector3d position, @Nullable Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `removePathWaypoint(UUID id, int index)` |
| `public` | `void` | `unloadPathWaypoint(UUID id, int index)` |
| `public` | `void` | `removePath(UUID id)` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `void` | `forEach(BiConsumer<UUID, IPrefabPath> consumer)` |
