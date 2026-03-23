# BuilderSensorLeash

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorLeash extends BuilderSensorBase

Senses the distance and direction to the NPC builder's leash position.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public SensorLeash build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public double getRange(BuilderSupport builderSupport)

Fields:
protected final DoubleHolder range
