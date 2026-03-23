# BuilderBodyMotionPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionPath extends BuilderBodyMotionBase

Controls NPC body motion along a builder path, moving the NPC between waypoints.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public BodyMotionPath build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionPath readConfig(JsonElement data)
  public double getPathWidth()
  public double getNodeWidth()
  public double getMinRelativeSpeed()
  public double getMaxRelativeSpeed()
  public double getMinWalkDistance()
  public double getMaxWalkDistance()
  public boolean isStartAtNearestNode()
  public BodyMotionPath.Direction getDirection()
  public BodyMotionPath.Shape getShape(BuilderSupport support)
  public double getMinNodeDelay()
  public double getMaxNodeDelay()
  public boolean isUseNodeViewDirection()
  public double[] getDelayScaleRange(BuilderSupport support)
  public double[] getPercentDelayRange(BuilderSupport support)
  public boolean isPickRandomAngle()
  public int getViewSegments(BuilderSupport support)

Fields:
public static final double[] DEFAULT_DELAY_SCALE_RANGE
public static final double[] DEFAULT_PERCENT_DELAY_RANGE
protected final EnumHolder<BodyMotionPath.Shape> shape
protected final NumberArrayHolder delayScaleRange
protected final NumberArrayHolder percentDelayRange
protected final IntHolder viewSegments
protected double pathWidth
protected double nodeWidth
protected double minRelativeSpeed
protected double maxRelativeSpeed
protected double minWalkDistance
protected double maxWalkDistance
protected boolean startAtNearestNode
protected BodyMotionPath.Direction direction
protected double minNodeDelay
protected double maxNodeDelay
protected boolean useNodeViewDirection
protected boolean pickRandomAngle
