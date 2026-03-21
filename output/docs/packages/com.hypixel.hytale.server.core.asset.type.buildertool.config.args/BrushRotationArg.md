---
title: "BrushRotationArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BrushRotationArg"
api_surface: true
extends: "ToolArg<Rotation>"
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
public class BrushRotationArg extends ToolArg<Rotation>
```

Extends `ToolArg` to provide BrushRotationArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Codec<Rotation>` | `ROTATION_CODEC` | `new EnumCodec<>(Rotation.class)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BrushRotationArg()` |
| `public` | | `BrushRotationArg(Rotation value)` |
| `@Nonnull @Override public` | `Codec<Rotation>` | `getCodec()` |
| `@Nonnull public` | `Rotation` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolRotationArg` | `toRotationArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
