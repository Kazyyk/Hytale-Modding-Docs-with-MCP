---
title: "EntityScaleComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.EntityScaleComponent"
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
public class EntityScaleComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `float` | `scale` |
| `private` | `boolean` | `isNetworkOutdated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, EntityScaleComponent>` | `getComponentType()` |
| `` | `public float` | `getScale()` |
| `` | `public void` | `setScale(float scale)` |
| `` | `public boolean` | `consumeNetworkOutdated()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
