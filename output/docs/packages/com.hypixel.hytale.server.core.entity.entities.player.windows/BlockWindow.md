---
title: "BlockWindow"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.BlockWindow"
api_surface: false
extends: "Window"
implements: ["ValidatedWindow"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "windows"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.windows`

```java
public abstract class BlockWindow extends Window implements ValidatedWindow
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `float` | `MAX_DISTANCE` |
| `protected final` | `int` | `x` |
| `protected final` | `int` | `y` |
| `protected final` | `int` | `z` |
| `protected` | `BlockType` | `blockType` |
| `protected final` | `int` | `rotationIndex` |
| `private` | `double` | `maxDistance` |
| `private` | `double` | `maxDistanceSqr` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getX()` |
| `public` | `int` | `getY()` |
| `public` | `int` | `getZ()` |
| `public` | `int` | `getRotationIndex()` |
| `@Nonnull public` | `BlockType` | `getBlockType()` |
| `public` | `void` | `setMaxDistance(double maxDistance)` |
| `public` | `double` | `getMaxDistance()` |
| `@Override public` | `boolean` | `validate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> store)` |
