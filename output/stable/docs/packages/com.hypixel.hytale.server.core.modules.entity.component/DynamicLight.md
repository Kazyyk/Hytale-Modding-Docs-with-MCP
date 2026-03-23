---
title: "DynamicLight"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.DynamicLight"
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
public class DynamicLight implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `ColorLight` | `colorLight` |
| `private` | `boolean` | `isNetworkOutdated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, DynamicLight>` | `getComponentType()` |
| `` | `public ColorLight` | `getColorLight()` |
| `` | `public void` | `setColorLight(ColorLight colorLight)` |
| `` | `public boolean` | `consumeNetworkOutdated()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
