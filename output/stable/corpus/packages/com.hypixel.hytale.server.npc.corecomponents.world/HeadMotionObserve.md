# HeadMotionObserve

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: HeadMotionBase

public class HeadMotionObserve extends HeadMotionBase

Head motion that sweeps the NPC's gaze across an angle range with configurable pause times, segment counts, and random angle selection. Uses model camera settings for yaw limits. Each instance has a corresponding `BuilderHeadMotionObserve` class for JSON deserialization.

Also in this package: ActionMakePath, ActionPlaceBlock, ActionResetBlockSensors, ActionResetPath, ActionResetSearchRays, ActionSetBlockToPlace, ActionSetLeashPosition, ActionStorePosition, ActionTriggerSpawners, BodyMotionPath, Direction, Direction, EventSearchType, LoadStatus, Offset, PathType, SensorBlock, SensorBlockChange, SensorBlockType, SensorCanPlace (and 11 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean tickPreDelay(double dt)
  protected boolean tickDelay(double dt)
  protected void pickNextAngle(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final float[] angleRange
protected final double[] pauseTimeRange
protected final boolean pickRandomAngle
protected final int viewSegments
protected final double relativeTurnSpeed
protected double preDelay
protected double delay
protected int currentViewSegment
protected boolean invertedDirection
protected float targetBodyOffsetYaw
protected final SteeringForceRotate steeringForceRotate
