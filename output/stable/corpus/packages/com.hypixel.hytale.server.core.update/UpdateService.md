# UpdateService

Type: class | Package: com.hypixel.hytale.server.core.update

public class UpdateService

Handles the HTTP communication for checking and downloading server updates. Authenticates via OAuth, fetches version manifests from the Hytale account-data service, downloads update archives with SHA-256 verification, and manages the staging/backup directory layout.

## Methods

- public CompletableFuture<UpdateService.VersionManifest> checkForUpdate(String patchline)
- public UpdateService.DownloadTask downloadUpdate(UpdateService.VersionManifest manifest, Path stagingDir, UpdateService.ProgressCallback progressCallback)
- public static String getEffectivePatchline()
- public static boolean isValidUpdateLayout()
- public static Path getStagingDir()
- public static Path getBackupDir()
- public static String getStagedVersion()
- public static boolean deleteStagedUpdate()
- public static boolean deleteBackupDir()
- public static String readVersionFromJar(Path jarPath)

## Inner Types

- UpdateService.DownloadTask | record | Holds the download future and thread
- UpdateService.ProgressCallback | interface | Callback for download progress (percent, downloaded, total)
- UpdateService.VersionManifest | class | Version manifest with version, downloadUrl, sha256 fields
