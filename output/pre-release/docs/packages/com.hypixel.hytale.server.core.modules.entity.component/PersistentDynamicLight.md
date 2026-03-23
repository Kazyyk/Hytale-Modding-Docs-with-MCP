---
title: "PersistentDynamicLight"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.PersistentDynamicLight"
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
public class PersistentDynamicLight implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `ColorLight` | `colorLight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, PersistentDynamicLight>` | `getComponentType()` |
| `` | `public ColorLight` | `getColorLight()` |
| `` | `public void` | `setColorLight(ColorLight colorLight)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
