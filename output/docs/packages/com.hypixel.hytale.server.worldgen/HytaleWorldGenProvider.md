---
title: "HytaleWorldGenProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen"
fqcn: "com.hypixel.hytale.server.worldgen.HytaleWorldGenProvider"
api_surface: false
extends: null
implements: ["IWorldGenProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.server.worldgen`

```java
public class HytaleWorldGenProvider implements IWorldGenProvider
```

Provider supplying HytaleWorldGen values based on context.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ID` | `"Hytale"` |
| `public static final` | `String` | `DEFAULT_NAME` | `"Default"` |
| `public static final` | `Semver` | `MIN_VERSION` | `new Semver(0L, 0L, 0L)` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private` | `String` | `name` | `"Default"` |
| `@Nonnull private` | `Semver` | `version` | `MIN_VERSION` |
| `@Nullable private` | `String` | `path` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Semver` | `getVersion()` |
| `@Nonnull @Override public` | `IWorldGen` | `getGenerator()` |
| `@Override public` | `String` | `toString()` |
