---
title: "PositionDataComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.PositionDataComponent"
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
public class PositionDataComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `insideBlockTypeId` |
| `private` | `int` | `standingOnBlockTypeId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, PositionDataComponent>` | `getComponentType()` |
| `` | `public int` | `getInsideBlockTypeId()` |
| `` | `public void` | `setInsideBlockTypeId(int insideBlockTypeId)` |
| `` | `public int` | `getStandingOnBlockTypeId()` |
| `` | `public void` | `setStandingOnBlockTypeId(int standingOnBlockTypeId)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
