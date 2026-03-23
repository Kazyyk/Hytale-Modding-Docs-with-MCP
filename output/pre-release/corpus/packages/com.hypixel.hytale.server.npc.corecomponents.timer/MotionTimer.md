# MotionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: MotionBase

public abstract class MotionTimer extends MotionBase

Abstract generic motion wrapper that constrains a child motion to a random time limit. The child motion is activated and deactivated with this wrapper. If the child motion returns `false` from `computeSteering`, the timer also terminates early.

## Fields

- motion | T | The wrapped motion.
- atLeastSeconds | double | Minimum active duration.
- atMostSeconds | double | Maximum active duration.
- activeTime | double | Elapsed active time.
- timeToLive | double | Randomly selected duration for this activation.

## Related Types

- BodyMotionTimer -- concrete body motion timer
- HeadMotionTimer -- concrete head motion timer
- BuilderMotionTimer -- abstract builder base

Known subclasses: BodyMotionTimer, HeadMotionTimer

Also in this package: ActionSetAlarm, ActionTimer, BodyMotionTimer, HeadMotionTimer, SensorAlarm, SensorTimer, State

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role support, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)

Fields:
protected final T motion
protected final double atLeastSeconds
protected final double atMostSeconds
protected double activeTime
protected double timeToLive
