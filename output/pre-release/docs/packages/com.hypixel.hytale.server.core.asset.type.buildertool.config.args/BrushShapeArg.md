---
title: "BrushShapeArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BrushShapeArg"
api_surface: true
extends: "ToolArg<BrushShape>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config.args`

```java
public class BrushShapeArg extends ToolArg<BrushShape>
```

Extends `ToolArg` to provide BrushShapeArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `EnumCodec<BrushShape>` | `BRUSH_SHAPE_CODEC` | `new EnumCodec<>(BrushShape.class)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BrushShapeArg()` |
| `public` | | `BrushShapeArg(BrushShape value)` |
| `@Nonnull @Override public` | `Codec<BrushShape>` | `getCodec()` |
| `@Nonnull public` | `BrushShape` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolBrushShapeArg` | `toBrushShapeArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
