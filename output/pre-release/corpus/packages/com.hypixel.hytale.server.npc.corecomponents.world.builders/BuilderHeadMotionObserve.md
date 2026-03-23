# BuilderHeadMotionObserve

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderHeadMotionBase

public class BuilderHeadMotionObserve extends BuilderHeadMotionBase

Controls NPC head rotation to observe blocks and positions during builder behavior.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public HeadMotionObserve build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderHeadMotionObserve readConfig(JsonElement data)
  public float[] getAngleRange(BuilderSupport support)
  public double[] getPauseTimeRange(BuilderSupport support)
  public boolean isPickRandomAngle(BuilderSupport support)
  public int getViewSegments(BuilderSupport support)
  public double getRelativeTurnSpeed(BuilderSupport support)

Fields:
protected static final double[] DEFAULT_PAUSE_TIME_RANGE
protected final NumberArrayHolder angleRange
protected final NumberArrayHolder pauseTimeRange
protected final BooleanHolder pickRandomAngle
protected final IntHolder viewSegments
protected final DoubleHolder relativeTurnSpeed
