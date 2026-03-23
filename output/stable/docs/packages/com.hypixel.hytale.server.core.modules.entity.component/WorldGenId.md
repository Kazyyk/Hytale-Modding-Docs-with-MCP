---
title: "WorldGenId"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.WorldGenId"
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
public class WorldGenId implements Component<EntityStore>
```

An `EntityStore` component.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `NON_WORLD_GEN_ID` | `0` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `worldGenId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, WorldGenId>` | `getComponentType()` |
| `` | `public int` | `getWorldGenId()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
