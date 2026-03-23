---
title: "FloatArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.FloatArg"
api_surface: false
extends: "ToolArg<Float>"
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
public class FloatArg extends ToolArg<Float>
```

Extends `ToolArg` to provide FloatArg functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `min` |
| `protected` | `float` | `max` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FloatArg()` |
| `public` | | `FloatArg(float value, float min, float max)` |
| `public` | `float` | `getMin()` |
| `public` | `float` | `getMax()` |
| `@Nonnull @Override public` | `Codec<Float>` | `getCodec()` |
| `@Nonnull public` | `Float` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolFloatArg` | `toFloatArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
