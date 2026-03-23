# BuilderSensorEvent

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorEvent extends BuilderSensorBase

Listens for general events relevant to the NPC builder's behavior.

Known subclasses: BuilderSensorBlockChange, BuilderSensorEntityEvent

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public Builder<Sensor> readConfig(JsonElement data)
  public double getRange(BuilderSupport support)
  public SensorEvent.EventSearchType getEventSearchType(BuilderSupport support)
  public int getLockOnTargetSlot(BuilderSupport support)

Fields:
protected final DoubleHolder range
protected final EnumHolder<SensorEvent.EventSearchType> searchType
protected final StringHolder lockOnTargetSlot
