---
title: "BlockArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BlockArg"
api_surface: true
extends: "ToolArg<BlockPattern>"
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
public class BlockArg extends ToolArg<BlockPattern>
```

Extends `ToolArg` to provide BlockArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BlockArg[]` | `EMPTY_ARRAY` | `new BlockArg[0]` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `allowPattern` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BlockArg()` |
| `public` | | `BlockArg(BlockPattern value, boolean allowPattern)` |
| `@Nonnull @Override public` | `Codec<BlockPattern>` | `getCodec()` |
| `@Nonnull public` | `BlockPattern` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolBlockArg` | `toBlockArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
