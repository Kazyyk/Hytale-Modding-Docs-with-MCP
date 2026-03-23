# AssetMonitorEvent

Type: class | Package: com.hypixel.hytale.assetstore.event

public class AssetMonitorEvent

Event for asset monitoring changes.

Known subclasses: AssetStoreMonitorEvent, CommonAssetMonitorEvent

Also in this package: AssetStoreEvent, AssetStoreMonitorEvent, AssetsEvent, GenerateAssetsEvent, LoadedAssetsEvent, ParentReference, RegisterAssetStoreEvent, RemoveAssetStoreEvent, RemovedAssetsEvent

Complete API:
  public String getAssetPack()
  public List<Path> getCreatedOrModifiedFilesToLoad()
  public List<Path> getRemovedFilesToUnload()
  public List<Path> getRemovedFilesAndDirectories()
  public List<Path> getCreatedOrModifiedDirectories()

Fields:
private final List<Path> createdOrModifiedFilesToLoad
private final List<Path> removedFilesToUnload
private final List<Path> createdOrModifiedDirectories
private final List<Path> removedFilesAndDirectories
private final String assetPack
