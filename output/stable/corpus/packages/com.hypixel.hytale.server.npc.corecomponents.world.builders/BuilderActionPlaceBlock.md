# BuilderActionPlaceBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderActionBase

public class BuilderActionPlaceBlock extends BuilderActionBase

Places a block at the NPC's current target position during builder behavior execution.

Also in this package: BuilderActionMakePath, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionPlaceBlock readConfig(JsonElement data)
  public double getRange(BuilderSupport support)
  public boolean isAllowEmptyMaterials(BuilderSupport support)

Fields:
protected final DoubleHolder range
protected final BooleanHolder allowEmptyMaterials
