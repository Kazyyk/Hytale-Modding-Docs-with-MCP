---
title: "Constants"
kind: "class"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.Constants"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "server"
  - "constants"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public final class Constants
```

Server-wide constants derived from command-line options and runtime checks. Provides static final flags for debug mode, singleplayer mode, self-op permission, fresh universe detection, network flush behavior, and the universe path. Also defines the ordered list of core plugin manifests (`CORE_PLUGINS`) that are registered during server startup.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `boolean` | `DEBUG` (= `true`) |
| `public static final` | `boolean` | `SINGLEPLAYER` |
| `public static final` | `boolean` | `ALLOWS_SELF_OP_COMMAND` |
| `public static final` | `boolean` | `FRESH_UNIVERSE` |
| `public static final` | `boolean` | `FORCE_NETWORK_FLUSH` |
| `public static final` | `Path` | `UNIVERSE_PATH` |
| `@Nonnull public static final` | `PluginManifest[]` | `CORE_PLUGINS` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `init()` |
| `public static` | `boolean` | `shouldSkipModValidation()` |
