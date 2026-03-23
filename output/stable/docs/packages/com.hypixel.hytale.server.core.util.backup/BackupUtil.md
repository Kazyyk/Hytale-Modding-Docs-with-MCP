---
title: "BackupUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.util.backup"
fqcn: "com.hypixel.hytale.server.core.util.backup.BackupUtil"
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
class BackupUtil
```

Class in the backup subsystem.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `walkFileTreeAndZip(@Nonnull Path sourceDir, @Nonnull Path zipPath)` | `void` | static package-private method. |
| `broadcastBackupStatus(boolean isWorldSaving)` | `void` | static package-private method. |
| `broadcastBackupError(Throwable cause)` | `void` | static package-private method. |
| `findOldBackups(@Nonnull Path backupDirectory, int maxBackupCount)` | `List<Path>` | static package-private method. |
