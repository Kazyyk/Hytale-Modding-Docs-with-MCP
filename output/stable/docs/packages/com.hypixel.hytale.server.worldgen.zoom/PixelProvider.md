---
title: "PixelProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zoom"
fqcn: "com.hypixel.hytale.server.worldgen.zoom.PixelProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "zoom"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.zoom`

```java
public class PixelProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int[]` | `pixels` |
| `protected final` | `int` | `width` |
| `protected final` | `int` | `height` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getWidth()` |
| `public` | `int` | `getHeight()` |
| `public` | `int[]` | `getPixels()` |
| `public` | `void` | `setPixel(int x, int y, int pixel)` |
| `public` | `int` | `getPixel(int x, int y)` |
| `protected` | `int` | `arrIndex(int x, int y)` |
| `public` | `PixelProvider` | `copy()` |
| `@Override @Nonnull public` | `String` | `toString()` |
