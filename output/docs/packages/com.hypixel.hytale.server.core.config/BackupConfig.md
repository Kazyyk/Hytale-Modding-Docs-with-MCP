---
title: "BackupConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.BackupConfig"
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
public class BackupConfig
```

Configuration class for Backup settings.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `DEFAULT_FREQUENCY_MINUTES` | `30` |
| `public static final` | `int` | `DEFAULT_MAX_COUNT` | `5` |
| `public static final` | `int` | `DEFAULT_ARCHIVE_MAX_COUNT` | `5` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private` | `Boolean` | `enabled` |
| `@Nullable private` | `Integer` | `frequencyMinutes` |
| `@Nullable private` | `String` | `directory` |
| `@Nullable private` | `Integer` | `maxCount` |
| `@Nullable private` | `Integer` | `archiveMaxCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BackupConfig()` |
| `public` | | `BackupConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `void` | `setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `boolean` | `isEnabled()` |
| `@Nullable public` | `Boolean` | `getEnabledConfig()` |
| `public` | `void` | `setEnabled(boolean enabled)` |
| `public` | `int` | `getFrequencyMinutes()` |
| `@Nullable public` | `Integer` | `getFrequencyMinutesConfig()` |
| `public` | `void` | `setFrequencyMinutes(int frequencyMinutes)` |
| `@Nullable public` | `Path` | `getDirectory()` |
| `@Nullable public` | `String` | `getDirectoryConfig()` |
| `public` | `void` | `setDirectory(@Nullable String directory)` |
| `public` | `int` | `getMaxCount()` |
| `@Nullable public` | `Integer` | `getMaxCountConfig()` |
| `public` | `void` | `setMaxCount(int maxCount)` |
| `public` | `int` | `getArchiveMaxCount()` |
| `@Nullable public` | `Integer` | `getArchiveMaxCountConfig()` |
| `public` | `void` | `setArchiveMaxCount(int archiveMaxCount)` |
| `public` | `boolean` | `isConfigured()` |
