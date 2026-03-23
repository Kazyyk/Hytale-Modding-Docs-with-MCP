---
title: "OptionArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.OptionArg"
api_surface: false
extends: "ToolArg<String>"
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
public class OptionArg extends ToolArg<String>
```

Extends `ToolArg` to provide OptionArg functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `options` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `OptionArg()` |
| `public` | | `OptionArg(String value, String[] options)` |
| `@Nonnull @Override public` | `Codec<String>` | `getCodec()` |
| `@Nonnull public` | `String` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolOptionArg` | `toOptionArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
