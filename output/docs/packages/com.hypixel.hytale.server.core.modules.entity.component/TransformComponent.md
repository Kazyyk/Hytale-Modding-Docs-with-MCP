---
title: "TransformComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.TransformComponent"
api_surface: true
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "modules"
  - "entity"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.component`

```java
public class TransformComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `WorldChunk` | `chunk` |
| `@Nullable private` | `Ref<ChunkStore>` | `chunkRef` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, TransformComponent>` | `getComponentType()` |
| `@Nonnull public` | `Vector3d` | `getPosition()` |
| `` | `public void` | `setPosition(@Nonnull Vector3d position)` |
| `` | `public void` | `teleportPosition(@Nonnull Vector3d position)` |
| `@Nonnull public` | `Vector3f` | `getRotation()` |
| `` | `public void` | `setRotation(@Nonnull Vector3f rotation)` |
| `@Nonnull public` | `Transform` | `getTransform()` |
| `` | `return new` | `Transform(this.position, this.rotation)` |
| `` | `public void` | `teleportRotation(@Nonnull Vector3f rotation)` |
| `@Nonnull public` | `ModelTransform` | `getSentTransform()` |
| `@Deprecated public` | `WorldChunk` | `getChunk()` |
| `@Nullable public` | `Ref<ChunkStore>` | `getChunkRef()` |
| `` | `public void` | `markChunkDirty(@Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `public void` | `setChunkLocation(@Nullable Ref<ChunkStore> chunkRef, @Nullable WorldChunk chunk)` |
