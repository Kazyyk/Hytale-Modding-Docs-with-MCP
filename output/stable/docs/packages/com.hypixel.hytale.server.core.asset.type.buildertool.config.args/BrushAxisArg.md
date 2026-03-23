---
title: "BrushAxisArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BrushAxisArg"
api_surface: true
extends: "ToolArg<BrushAxis>"
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
public class BrushAxisArg extends ToolArg<BrushAxis>
```

Extends `ToolArg` to provide BrushAxisArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Codec<BrushAxis>` | `BRUSH_AXIS_CODEC` | `new EnumCodec<>(BrushAxis.class)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BrushAxisArg()` |
| `public` | | `BrushAxisArg(BrushAxis value)` |
| `@Nonnull @Override public` | `Codec<BrushAxis>` | `getCodec()` |
| `@Nonnull public` | `BrushAxis` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolBrushAxisArg` | `toBrushAxisArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
