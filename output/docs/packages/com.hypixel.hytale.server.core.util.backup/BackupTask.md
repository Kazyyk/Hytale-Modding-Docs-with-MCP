---
title: "BackupTask"
kind: "class"
package: "com.hypixel.hytale.server.core.util.backup"
fqcn: "com.hypixel.hytale.server.core.util.backup.BackupTask"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "backup"
---

**Package:** `com.hypixel.hytale.server.core.util.backup`

```java
public class BackupTask
```

Class in the backup subsystem.

## Constructors

| Constructor | Description |
|---|---|
| `BackupTask(@Nonnull final Path universeDir, @Nonnull final Path backupDir)` | Creates a new BackupTask instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `start(@Nonnull Path universeDir, @Nonnull Path backupDir)` | `CompletableFuture<Void>` | static public method. |
| `cleanOrArchiveOldBackups(@Nonnull Path sourceDir, @Nonnull Path archiveDir)` | `void` | static private method. |
| `cleanOldArchives(@Nonnull Path dir)` | `void` | static private method. |
| `getMostRecentArchive(@Nonnull Path dir)` | `FileTime` | static private method. |
