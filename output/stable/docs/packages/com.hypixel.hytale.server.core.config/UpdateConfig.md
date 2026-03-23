---
title: "UpdateConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.UpdateConfig"
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
public class UpdateConfig
```

Configuration class for Update settings.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `DEFAULT_CHECK_INTERVAL_SECONDS` | `3600` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Boolean` | `enabled` |
| `private` | `Integer` | `checkIntervalSeconds` |
| `private` | `Boolean` | `notifyPlayersOnAvailable` |
| `private` | `String` | `patchline` |
| `private` | `Boolean` | `runBackupBeforeUpdate` |
| `private` | `Boolean` | `backupConfigBeforeUpdate` |
| `private` | `UpdateConfig.AutoApplyMode` | `autoApplyMode` |
| `private` | `Integer` | `autoApplyDelayMinutes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `UpdateConfig()` |
| `public` | | `UpdateConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `void` | `setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `boolean` | `isEnabled()` |
| `public` | `void` | `setEnabled(boolean enabled)` |
| `public` | `int` | `getCheckIntervalSeconds()` |
| `public` | `void` | `setCheckIntervalSeconds(int checkIntervalSeconds)` |
| `public` | `boolean` | `isNotifyPlayersOnAvailable()` |
| `public` | `void` | `setNotifyPlayersOnAvailable(boolean notifyPlayersOnAvailable)` |
| `@Nullable public` | `String` | `getPatchline()` |
| `public` | `void` | `setPatchline(@Nullable String patchline)` |
| `public` | `boolean` | `isRunBackupBeforeUpdate()` |
| `public` | `void` | `setRunBackupBeforeUpdate(boolean runBackupBeforeUpdate)` |
| `public` | `boolean` | `isBackupConfigBeforeUpdate()` |
| `public` | `void` | `setBackupConfigBeforeUpdate(boolean backupConfigBeforeUpdate)` |
| `@Nonnull public` | `UpdateConfig.AutoApplyMode` | `getAutoApplyMode()` |
| `public` | `void` | `setAutoApplyMode(@Nonnull UpdateConfig.AutoApplyMode autoApplyMode)` |
| `public` | `int` | `getAutoApplyDelayMinutes()` |
| `public` | `void` | `setAutoApplyDelayMinutes(int autoApplyDelayMinutes)` |
