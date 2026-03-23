---
title: "BrushOriginArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BrushOriginArg"
api_surface: true
extends: "ToolArg<BrushOrigin>"
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
public class BrushOriginArg extends ToolArg<BrushOrigin>
```

Extends `ToolArg` to provide BrushOriginArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `EnumCodec<BrushOrigin>` | `BRUSH_ORIGIN_CODEC` | `new EnumCodec<>(BrushOrigin.class)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BrushOriginArg()` |
| `public` | | `BrushOriginArg(BrushOrigin value)` |
| `@Nonnull @Override public` | `Codec<BrushOrigin>` | `getCodec()` |
| `@Nonnull public` | `BrushOrigin` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolBrushOriginArg` | `toBrushOriginArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
