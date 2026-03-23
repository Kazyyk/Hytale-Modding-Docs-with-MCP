---
title: "ToolArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.ToolArg"
api_surface: true
extends: null
implements: ["NetworkSerializable<BuilderToolArg>"]
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
public abstract class ToolArg<T> implements NetworkSerializable<BuilderToolArg>
```

Abstract base class providing shared logic for ToolArg implementations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `CodecMapCodec<ToolArg>` | `CODEC` | `new CodecMapCodec<>("Type")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `boolean` | `required` | `true` |
| `protected` | `T` | `value` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `T` | `getValue()` |
| `public` | `boolean` | `isRequired()` |
| `public abstract` | `Codec<T>` | `getCodec()` |
| `@Nonnull public abstract` | `T` | `fromString(@Nonnull String var1)` |
| `protected abstract` | `void` | `setupPacket(BuilderToolArg var1)` |
| `@Nonnull public` | `BuilderToolArg` | `toPacket()` |
| `@Nonnull @Override public` | `String` | `toString()` |
