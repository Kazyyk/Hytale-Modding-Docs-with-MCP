# BuilderActionTriggerSpawners

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderActionBase

public class BuilderActionTriggerSpawners extends BuilderActionBase

Triggers spawner blocks in the NPC builder's vicinity.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderActionTriggerSpawners readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public String getSpawner(BuilderSupport support)
  public double getRange(BuilderSupport support)
  public int getCount(BuilderSupport support)

Fields:
protected final AssetHolder spawner
protected final DoubleHolder range
protected final IntHolder count
