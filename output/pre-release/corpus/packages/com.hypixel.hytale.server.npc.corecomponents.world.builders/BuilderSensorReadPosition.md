# BuilderSensorReadPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorReadPosition extends BuilderSensorBase

Reads a previously stored position for use in builder decision-making.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public int getSlot(BuilderSupport support)
  public boolean isUseMarkedTarget(BuilderSupport support)
  public double getMinRange(BuilderSupport support)
  public double getRange(BuilderSupport support)

Fields:
protected final StringHolder slot
protected final BooleanHolder useMarkedTarget
protected final DoubleHolder range
protected final DoubleHolder minRange
