# BuilderSensorPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorPath extends BuilderSensorBase

Provides path state information (remaining distance, waypoint count, etc.) for the NPC builder.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public Sensor build(BuilderSupport builderSupport)
  public Builder<Sensor> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public String getPath(BuilderSupport support)
  public double getRange(BuilderSupport support)
  public SensorPath.PathType getPathType(BuilderSupport support)

Fields:
protected final StringHolder name
protected final DoubleHolder range
protected final EnumHolder<SensorPath.PathType> pathType
