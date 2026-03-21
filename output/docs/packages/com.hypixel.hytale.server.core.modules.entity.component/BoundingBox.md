---
title: "BoundingBox"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.BoundingBox"
api_surface: false
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
public class BoundingBox implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `Map<String, DetailBox[]>` | `detailBoxes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, BoundingBox>` | `getComponentType()` |
| `@Nonnull public` | `Box` | `getBoundingBox()` |
| `` | `public void` | `setBoundingBox(@Nonnull Box boundingBox)` |
| `` | `public Map<String, DetailBox[]>` | `getDetailBoxes()` |
| `` | `public void` | `setDetailBoxes(Map<String, DetailBox[]> detailBoxes)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
