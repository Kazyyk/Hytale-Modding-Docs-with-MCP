---
title: "CollisionResultComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.CollisionResultComponent"
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
public class CollisionResultComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `pendingCollisionCheck` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, CollisionResultComponent>` | `getComponentType()` |
| `` | `public CollisionResult` | `getCollisionResult()` |
| `` | `public Vector3d` | `getCollisionStartPosition()` |
| `` | `public Vector3d` | `getCollisionPositionOffset()` |
| `` | `public Vector3d` | `getCollisionStartPositionCopy()` |
| `` | `public Vector3d` | `getCollisionPositionOffsetCopy()` |
| `` | `public boolean` | `isPendingCollisionCheck()` |
| `` | `public void` | `markPendingCollisionCheck()` |
| `` | `public void` | `consumePendingCollisionCheck()` |
| `` | `public void` | `resetLocationChange()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
