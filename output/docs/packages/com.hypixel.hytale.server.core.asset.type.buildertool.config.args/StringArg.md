---
title: "StringArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.StringArg"
api_surface: true
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
public class StringArg extends ToolArg<String>
```

Extends `ToolArg` to provide StringArg functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `StringArg[]` | `EMPTY_ARRAY` | `new StringArg[0]` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `StringArg()` |
| `public` | | `StringArg(String value)` |
| `@Nonnull @Override public` | `Codec<String>` | `getCodec()` |
| `@Nonnull public` | `String` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolStringArg` | `toStringArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
