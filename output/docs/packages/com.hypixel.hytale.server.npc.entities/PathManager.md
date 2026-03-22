---
title: "PathManager"
kind: "class"
package: "com.hypixel.hytale.server.npc.entities"
fqcn: "com.hypixel.hytale.server.npc.entities.PathManager"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "entities"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.entities`

```java
public class PathManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `UUID` | `currentPathHint` |
| `private` | `IPath<?>` | `currentPath` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setPrefabPath(@Nonnull UUID currentPath, @Nonnull IPrefabPath path)` |
| `public` | `void` | `setTransientPath(@Nonnull IPath<?> path)` |
| `public` | `boolean` | `isFollowingPath()` |
| `@Nullable public` | `UUID` | `getCurrentPathHint()` |
| `@Nullable public` | `IPath<?>` | `getPath(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
