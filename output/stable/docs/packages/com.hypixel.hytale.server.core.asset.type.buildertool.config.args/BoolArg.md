---
title: "BoolArg"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.BoolArg"
api_surface: true
extends: "ToolArg<Boolean>"
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
public class BoolArg extends ToolArg<Boolean>
```

Extends `ToolArg` to provide BoolArg functionality.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BoolArg()` |
| `public` | | `BoolArg(boolean value)` |
| `@Nonnull @Override public` | `Codec<Boolean>` | `getCodec()` |
| `@Nonnull public` | `Boolean` | `fromString(@Nonnull String str)` |
| `@Nonnull public` | `BuilderToolBoolArg` | `toBoolArgPacket()` |
| `@Override protected` | `void` | `setupPacket(@Nonnull BuilderToolArg packet)` |
| `@Nonnull @Override public` | `String` | `toString()` |
