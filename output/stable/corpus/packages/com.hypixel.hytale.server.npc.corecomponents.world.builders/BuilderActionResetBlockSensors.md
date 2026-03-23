# BuilderActionResetBlockSensors

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderActionBase

public class BuilderActionResetBlockSensors extends BuilderActionBase

Resets all block sensor data for the NPC builder, clearing cached block detection results.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionResetBlockSensors readConfig(JsonElement data)
  public int[] getBlockSets(BuilderSupport support)

Fields:
protected final AssetArrayHolder blockSets
