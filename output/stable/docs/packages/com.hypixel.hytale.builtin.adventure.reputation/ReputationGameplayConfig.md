---
title: "ReputationGameplayConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.reputation"
fqcn: "com.hypixel.hytale.builtin.adventure.reputation.ReputationGameplayConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "reputation"
---

**Package:** `com.hypixel.hytale.builtin.adventure.reputation`

```java
public class ReputationGameplayConfig
```

Configuration class for Reputation settings.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ID` | `"Reputation"` |
| `@Nonnull private static final` | `ReputationGameplayConfig` | `DEFAULT_REPUTATION_GAMEPLAY_CONFIG` | `new ReputationGameplayConfig()` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull protected` | `ReputationGameplayConfig.ReputationStorageType` | `reputationStorageType` | `ReputationGameplayConfig.ReputationStorageType.PerPlayer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public static` | `ReputationGameplayConfig` | `get(@Nonnull GameplayConfig config)` |
| `@Nonnull public static` | `ReputationGameplayConfig` | `getOrDefault(@Nonnull GameplayConfig config)` |
| `@Nonnull public` | `ReputationGameplayConfig.ReputationStorageType` | `getReputationStorageType()` |
| `@Nonnull @Override public` | `String` | `toString()` |
