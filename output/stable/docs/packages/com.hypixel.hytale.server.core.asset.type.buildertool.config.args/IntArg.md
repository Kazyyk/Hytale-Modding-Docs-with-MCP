---
title: "IntArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.IntArg"
api_surface: true
extends: "ToolArg<Integer>"
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
public class IntArg extends ToolArg<Integer>
```

Extends `ToolArg` to provide IntArg functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `min` |
| `protected` | `int` | `max` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `IntArg()` |
| `public` | | `IntArg(int value, int min, int max)` |
| `@Nonnull @Override public` | `Codec<Integer>` | `getCodec()` |
| `public` | `int` | `getMin()` |
| `public` | `int` | `getMax()` |
| `@Nonnull public` | `Integer` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolIntArg` | `toIntArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
