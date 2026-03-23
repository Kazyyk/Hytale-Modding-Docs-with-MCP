---
title: "PatchStyle"
kind: "class"
package: "com.hypixel.hytale.server.core.ui"
fqcn: "com.hypixel.hytale.server.core.ui.PatchStyle"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.ui`

```java
public class PatchStyle
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PatchStyle>` | `CODEC` |
| `private` | `Value<String>` | `texturePath` |
| `private` | `Value<Integer>` | `border` |
| `private` | `Value<Integer>` | `horizontalBorder` |
| `private` | `Value<Integer>` | `verticalBorder` |
| `private` | `Value<String>` | `color` |
| `private` | `Value<Area>` | `area` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PatchStyle()` |
| `public` | `PatchStyle(Value<String> texturePath)` |
| `public` | `PatchStyle(Value<String> texturePath, Value<Integer> border)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `PatchStyle` | `setTexturePath(Value<String> texturePath)` |
| `@Nonnull public` | `PatchStyle` | `setBorder(Value<Integer> border)` |
| `@Nonnull public` | `PatchStyle` | `setHorizontalBorder(Value<Integer> horizontalBorder)` |
| `@Nonnull public` | `PatchStyle` | `setVerticalBorder(Value<Integer> verticalBorder)` |
| `@Nonnull public` | `PatchStyle` | `setColor(Value<String> color)` |
| `@Nonnull public` | `PatchStyle` | `setArea(Value<Area> area)` |
