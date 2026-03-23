# BuilderSensorLight

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorLight extends BuilderSensorBase

Senses the light level at the NPC builder's position or target position.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorPath (and 4 more)

Complete API:
  public SensorLight build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public int getUsedTargetSlot(BuilderSupport support)
  public double[] getLightRange(BuilderSupport builderSupport)
  public double[] getSkyLightRange(BuilderSupport builderSupport)
  public double[] getSunlightRange(BuilderSupport builderSupport)
  public double[] getRedLightRange(BuilderSupport builderSupport)
  public double[] getGreenLightRange(BuilderSupport builderSupport)
  public double[] getBlueLightRange(BuilderSupport builderSupport)

Fields:
public static final double[] FULL_LIGHT_RANGE
protected final StringHolder useTargetSlot
protected final NumberArrayHolder lightRange
protected final NumberArrayHolder skyLightRange
protected final NumberArrayHolder sunlightRange
protected final NumberArrayHolder redLightRange
protected final NumberArrayHolder greenLightRange
protected final NumberArrayHolder blueLightRange
