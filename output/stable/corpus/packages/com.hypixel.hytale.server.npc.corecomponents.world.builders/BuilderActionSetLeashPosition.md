# BuilderActionSetLeashPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderActionBase

public class BuilderActionSetLeashPosition extends BuilderActionBase

Sets the NPC builder's leash position, anchoring it to a specific location.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public ActionSetLeashPosition build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSetLeashPosition readConfig(JsonElement data)
  public boolean isToTarget()
  public boolean isToCurrent()

Fields:
protected boolean toTarget
protected boolean toCurrent
