# BuilderActionTriggerSpawnBeacon

Type: class | Package: com.hypixel.hytale.server.spawning.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionTriggerSpawnBeacon extends BuilderActionBase

## Fields

- protected final AssetHolder beaconId
- protected final IntHolder range
- protected String targetSlot

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Action build(BuilderSupport builderSupport)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionTriggerSpawnBeacon readConfig(JsonElement data)
- public int getBeaconId(BuilderSupport support)
- public int getRange(BuilderSupport support)
- public int getTargetSlot(BuilderSupport support)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionTriggerSpawnBeacon readConfig(JsonElement data)
  public int getBeaconId(BuilderSupport support)
  public int getRange(BuilderSupport support)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final AssetHolder beaconId
protected final IntHolder range
protected String targetSlot
