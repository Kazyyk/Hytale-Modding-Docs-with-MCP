---
title: "RotateObjectComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.RotateObjectComponent"
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
public class RotateObjectComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `float` | `rotationSpeed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, RotateObjectComponent>` | `getComponentType()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
| `` | `public void` | `setRotationSpeed(float rotationSpeed)` |
| `` | `public float` | `getRotationSpeed()` |
