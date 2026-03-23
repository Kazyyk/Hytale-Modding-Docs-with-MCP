---
title: "WorldGenConfig"
kind: "record"
package: "com.hypixel.hytale.server.worldgen"
fqcn: "com.hypixel.hytale.server.worldgen.WorldGenConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "record"
---

**Package:** `com.hypixel.hytale.server.worldgen`

```java
public record WorldGenConfig(@Nonnull Path path, @Nonnull String name, @Nonnull Semver version)
```

An immutable record holding `path`, `name`, `version`.

## Components

| Type | Name |
|---|---|
| `@Nonnull Path` | `path` |
| `@Nonnull String` | `name` |
| `@Nonnull Semver` | `version` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `record` | `WorldGenConfig(@Nonnull Path path, @Nonnull String name, @Nonnull Semver version)` |
| `public` | `WorldGenConfig` | `withOverride(@Nonnull Path path)` |
