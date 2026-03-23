---
title: "MaskArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.MaskArg"
api_surface: true
extends: "ToolArg<BlockMask>"
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
public class MaskArg extends ToolArg<BlockMask>
```

Extends `ToolArg` to provide MaskArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `MaskArg` | `EMPTY` | `new MaskArg(BlockMask.EMPTY, false)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `MaskArg()` |
| `public` | | `MaskArg(BlockMask value)` |
| `public` | | `MaskArg(BlockMask value, boolean required)` |
| `@Nonnull @Override public` | `Codec<BlockMask>` | `getCodec()` |
| `@Nonnull public` | `BlockMask` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolMaskArg` | `toMaskArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
