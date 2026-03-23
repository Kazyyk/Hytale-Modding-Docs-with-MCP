---
title: "WorldReturnPoint"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.config"
fqcn: "com.hypixel.hytale.builtin.instances.config.WorldReturnPoint"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "instances"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.config`

```java
public class WorldReturnPoint
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<WorldReturnPoint>` | `CODEC` |
| `private` | `UUID` | `world` |
| `private` | `Transform` | `returnPoint` |
| `private` | `boolean` | `returnOnReconnect` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldReturnPoint()` |
| `public` | `WorldReturnPoint(UUID world, Transform returnPoint, boolean returnOnReconnect)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `UUID` | `getWorld()` |
| `public` | `void` | `setWorld(UUID world)` |
| `public` | `Transform` | `getReturnPoint()` |
| `public` | `void` | `setReturnPoint(Transform returnPoint)` |
| `public` | `boolean` | `isReturnOnReconnect()` |
| `public` | `void` | `setReturnOnReconnect(boolean returnOnReconnect)` |
| `@Nonnull public` | `WorldReturnPoint` | `clone()` |
