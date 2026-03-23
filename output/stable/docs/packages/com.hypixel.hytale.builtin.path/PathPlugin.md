---
title: "PathPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.path"
fqcn: "com.hypixel.hytale.builtin.path.PathPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "path"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.path`

```java
public class PathPlugin extends JavaPlugin
```

Plugin providing the path and patrol system. Registers entity types for path markers, ECS systems for managing prefab paths and world paths, and commands for path manipulation. Manages spatial indexing of path markers using KDTree.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `PathPlugin` | `get()` |
| `public` | `ResourceType<EntityStore, WorldPathData>` | `getWorldPathDataResourceType()` |
| `public` | `ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>>` | `getPrefabPathSpatialResource()` |
| `public` | `ComponentType<EntityStore, WorldPathBuilder>` | `getWorldPathBuilderComponentType()` |
| `public` | `Model` | `getPathMarkerModel()` |

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `KeyedCodec<String>` | `PATH_MARKER_MODEL` |
| `public static final` | `String` | `DEFAULT_PATH_MARKER_MODEL` |
