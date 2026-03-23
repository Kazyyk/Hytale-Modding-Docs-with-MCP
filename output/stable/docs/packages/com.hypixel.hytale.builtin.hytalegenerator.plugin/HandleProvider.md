---
title: "HandleProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.plugin"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.plugin.HandleProvider"
api_surface: false
extends: null
implements: ["IWorldGenProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "plugin"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.plugin`

```java
public class HandleProvider implements IWorldGenProvider
```

Provider supplying Handle values based on context.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `String` | `ID` | `"HytaleGenerator"` |
| `@Nonnull public static final` | `String` | `DEFAULT_WORLD_STRUCTURE_NAME` | `"Default"` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `HytaleGenerator` | `plugin` |  |
| `@Nonnull private` | `String` | `worldStructureName` | `"Default"` |
| `@Nullable private` | `String` | `seedOverride` |  |
| `private` | `int` | `worldCounter` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HandleProvider(@Nonnull HytaleGenerator plugin, int worldCounter)` |
| `public` | `void` | `setWorldStructureName(@Nullable String worldStructureName)` |
| `public` | `void` | `setSeedOverride(@Nullable String seedOverride)` |
| `@Nonnull public` | `String` | `getWorldStructureName()` |
| `@Nullable public` | `String` | `getSeedOverride()` |
| `@Nonnull @Override public` | `IWorldGen` | `getGenerator()` |
