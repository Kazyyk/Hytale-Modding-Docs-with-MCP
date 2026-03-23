# BuilderSensorCanPlace

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorCanPlace extends BuilderSensorBase

Checks whether the NPC builder can place a block at a specific position.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public SensorCanPlace.Direction getDirection(BuilderSupport support)
  public SensorCanPlace.Offset getOffset(BuilderSupport support)
  public double getRetryDelay(BuilderSupport support)
  public boolean isAllowEmptyMaterials(BuilderSupport support)

Fields:
protected final EnumHolder<SensorCanPlace.Direction> direction
protected final EnumHolder<SensorCanPlace.Offset> offset
protected final DoubleHolder retryDelay
protected final BooleanHolder allowEmptyMaterials
