---
title: "AssetPath"
kind: "class"
package: "com.hypixel.hytale.procedurallib.file"
fqcn: "com.hypixel.hytale.procedurallib.file.AssetPath"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "procedurallib"
  - "file"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.file`

```java
public final class AssetPath
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Path` | `path` |
| `private final` | `Path` | `filepath` |
| `private final transient` | `int` | `hash` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `AssetPath(@Nonnull Path path, @Nonnull Path filepath)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `AssetPath` | `rename(@Nonnull String filename)` |
| `@Nonnull public` | `Path` | `path()` |
| `@Nonnull public` | `Path` | `filepath()` |
| `@Nonnull public` | `String` | `getFileName()` |
| `@Override public` | `String` | `toString()` |
| `@Override public` | `int` | `hashCode()` |
| `@Override public` | `boolean` | `equals(Object obj)` |
| `public static` | `AssetPath` | `fromAbsolute(@Nonnull Path root, @Nonnull Path filepath)` |
| `public static` | `AssetPath` | `fromRelative(@Nonnull Path root, @Nonnull Path assetPath)` |
