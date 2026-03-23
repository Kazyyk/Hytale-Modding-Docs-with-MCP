# BuilderSensorSearchRay

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorSearchRay extends BuilderSensorBase

Casts directional search rays to find blocks or open spaces for construction.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public float getAngle(BuilderSupport support)
  public double getRange(BuilderSupport support)
  public int getBlockSet(BuilderSupport support)
  public float getMinRetestAngle(BuilderSupport support)
  public double getMinRetestMove(BuilderSupport support)
  public double getThrottleTime(BuilderSupport support)
  public int getId(BuilderSupport support)

Fields:
protected final StringHolder id
protected final FloatHolder angle
protected final DoubleHolder range
protected final AssetHolder blockSet
protected final FloatHolder minRetestAngle
protected final DoubleHolder minRetestMove
protected final DoubleHolder throttleTime
