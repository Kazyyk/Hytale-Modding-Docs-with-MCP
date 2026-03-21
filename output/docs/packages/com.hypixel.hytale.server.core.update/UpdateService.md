---
title: "UpdateService"
kind: "class"
package: "com.hypixel.hytale.server.core.update"
fqcn: "com.hypixel.hytale.server.core.update.UpdateService"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "update"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.update`

```java
public class UpdateService
```

Handles the HTTP communication for checking and downloading server updates. Authenticates via OAuth, fetches version manifests from the Hytale account-data service, downloads update archives with SHA-256 verification, and manages the staging/backup directory layout.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CompletableFuture<UpdateService.VersionManifest>` | `checkForUpdate(String patchline)` |
| `public` | `UpdateService.DownloadTask` | `downloadUpdate(UpdateService.VersionManifest manifest, Path stagingDir, UpdateService.ProgressCallback progressCallback)` |
| `public static` | `String` | `getEffectivePatchline()` |
| `public static` | `boolean` | `isValidUpdateLayout()` |
| `public static` | `Path` | `getStagingDir()` |
| `public static` | `Path` | `getBackupDir()` |
| `public static` | `String` | `getStagedVersion()` |
| `public static` | `boolean` | `deleteStagedUpdate()` |
| `public static` | `boolean` | `deleteBackupDir()` |
| `public static` | `String` | `readVersionFromJar(Path jarPath)` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `UpdateService.DownloadTask` | record | Holds the download future and thread |
| `UpdateService.ProgressCallback` | interface | Callback for download progress (percent, downloaded, total) |
| `UpdateService.VersionManifest` | class | Version manifest with version, downloadUrl, sha256 fields |
