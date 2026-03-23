# UpdateModule

Type: class | Package: com.hypixel.hytale.server.core.update | Extends: JavaPlugin

public class UpdateModule extends JavaPlugin

Server plugin that manages automatic update checking, downloading, and staged application. Periodically checks for new server versions via authenticated HTTP requests, downloads updates to a staging directory, and supports auto-apply with configurable delay and player notification. Can be disabled via the `HYTALE_DISABLE_UPDATES` environment variable.

## Constants

- public static final PluginManifest MANIFEST
- public static final boolean KILL_SWITCH_ENABLED

## Methods

- public static UpdateModule get()
- public UpdateService.VersionManifest getLatestKnownVersion()
- public void setLatestKnownVersion(UpdateService.VersionManifest version)
- public boolean isDownloadInProgress()
- public boolean tryAcquireDownloadLock()
- public void setActiveDownload(CompletableFuture<?> download, Thread thread)
- public void releaseDownloadLock()
- public void updateDownloadProgress(long downloaded, long total)
- public UpdateModule.DownloadProgress getDownloadProgress()
- public boolean cancelDownload()
- public void onServerReady()

## Inner Types

- UpdateModule.DownloadProgress | record | Progress data: percent, downloadedBytes, totalBytes, etaSeconds

Also in this package: DownloadProgress, DownloadTask, ProgressCallback, SignedUrlResponse, UpdateService, VersionManifest

Complete API:
  public static UpdateModule get()
  protected void setup()
  protected void start()
  private synchronized void startAutoApplyTaskIfNeeded()
  protected void shutdown()
  public void onServerReady()
  public UpdateService.VersionManifest getLatestKnownVersion()
  public void setLatestKnownVersion(UpdateService.VersionManifest version)
  public boolean isDownloadInProgress()
  public boolean tryAcquireDownloadLock()
  public void setActiveDownload(CompletableFuture<?> download, Thread thread)
  public void releaseDownloadLock()
  public void updateDownloadProgress(long downloaded, long total)
  public UpdateModule.DownloadProgress getDownloadProgress()
  public boolean cancelDownload()
  private boolean shouldEnableUpdateChecker()
  private void performUpdateCheck()
  private void autoDownloadUpdate(UpdateService updateService, UpdateService.VersionManifest manifest)
  private void performAutoApplyCheck()
  private void logUpdateAvailable(String currentVersion, String latestVersion)
  private void logStagedUpdateWarning(String version, boolean isStartup)
  private void checkAutoApply(String stagedVersion)
  private void triggerAutoApply()
  private void broadcastToPlayers(Message message)
  private void notifyPlayers(String version)

Fields:
public static final PluginManifest MANIFEST
private static final HytaleLogger LOGGER
public static final boolean KILL_SWITCH_ENABLED
private static UpdateModule instance
private final ScheduledExecutorService scheduler
private ScheduledFuture<?> updateCheckTask
private ScheduledFuture<?> autoApplyTask
private final AtomicReference<UpdateService.VersionManifest> latestKnownVersion
private final AtomicReference<CompletableFuture<?>> activeDownload
private final AtomicReference<Thread> activeDownloadThread
private final AtomicBoolean downloadLock
private final AtomicLong downloadStartTime
private final AtomicLong downloadedBytes
private final AtomicLong totalBytes
private final AtomicLong autoApplyScheduledTime
private final AtomicLong lastWarningTime
