# AssetMonitorHandler

Type: interface | Package: com.hypixel.hytale.server.core.asset.monitor | Implements: BiPredicate<Path, EventKind>, Consumer<Map<Path, EventKind>>

public interface AssetMonitorHandler extends BiPredicate<Path, EventKind>, Consumer<Map<Path, EventKind>>

Defines the contract for AssetMonitorHandler operations. Extends `BiPredicate<Path, EventKind>` and `Consumer<Map<Path, EventKind>>` to filter and handle file system change events for hot-reloading assets.

## Methods

- Object getKey()

Known implementors: AssetStoreMonitorHandler, BuilderAssetMonitorHandler, CommonAssetMonitorHandler, I18nAssetMonitorHandler

Also in this package: AssetMonitor, DirectoryHandlerChangeTask, EventKind, FileChangeTask, PathEvent, PathWatcherThread

Complete API:
  Object getKey()
