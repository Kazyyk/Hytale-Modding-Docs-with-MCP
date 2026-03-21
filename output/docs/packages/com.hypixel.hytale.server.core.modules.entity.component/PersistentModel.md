---
title: "PersistentModel"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.PersistentModel"
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
public class PersistentModel implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Model.ModelReference` | `modelReference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, PersistentModel>` | `getComponentType()` |
| `@Nonnull public` | `Model.ModelReference` | `getModelReference()` |
| `` | `public void` | `setModelReference(@Nonnull Model.ModelReference modelReference)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
