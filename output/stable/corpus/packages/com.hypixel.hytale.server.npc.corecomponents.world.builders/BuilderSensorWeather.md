# BuilderSensorWeather

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorWeather extends BuilderSensorBase

Provides weather condition information for the NPC builder's behavior.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public String[] getWeathers(BuilderSupport support)

Fields:
protected final AssetArrayHolder weathers
