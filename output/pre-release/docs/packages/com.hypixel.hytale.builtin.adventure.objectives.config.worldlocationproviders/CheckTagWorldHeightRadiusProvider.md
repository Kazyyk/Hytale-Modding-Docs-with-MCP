---
title: "CheckTagWorldHeightRadiusProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders.CheckTagWorldHeightRadiusProvider"
api_surface: false
extends: "WorldLocationProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "worldlocationproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders`

```java
public class CheckTagWorldHeightRadiusProvider extends WorldLocationProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `blockTags` |
| `protected` | `int` | `radius` |
| `private` | `int[]` | `blockTagsIndexes` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CheckTagWorldHeightRadiusProvider(@Nonnull String[] blockTags, int radius)` |
| `protected` | `CheckTagWorldHeightRadiusProvider()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `Vector3i` | `runCondition(@Nonnull World world, @Nonnull Vector3i position)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
