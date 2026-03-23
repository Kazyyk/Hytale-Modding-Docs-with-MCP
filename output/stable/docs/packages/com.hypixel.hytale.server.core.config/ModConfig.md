---
title: "ModConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.ModConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.config`

```java
public class ModConfig
```

Configuration class for Mod settings.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private` | `Boolean` | `enabled` |
| `@Nullable private` | `SemverRange` | `requiredVersion` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `Boolean` | `getEnabled()` |
| `public` | `void` | `setEnabled(@Nonnull Boolean enabled)` |
| `@Nullable public` | `SemverRange` | `getRequiredVersion()` |
| `public` | `void` | `setRequiredVersion(@Nonnull SemverRange requiredVersion)` |
