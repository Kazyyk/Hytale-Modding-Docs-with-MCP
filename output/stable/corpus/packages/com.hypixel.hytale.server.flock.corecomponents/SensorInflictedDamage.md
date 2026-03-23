# SensorInflictedDamage

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: SensorBase

public class SensorInflictedDamage extends SensorBase

## Fields

- protected final SensorInflictedDamage.Target target
- protected final boolean friendlyFire
- protected final EntityPositionProvider positionProvider
- private final String description

## Methods

- @Override public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- @Override public InfoProvider getSensorInfo()
- protected static boolean inSameFlock(@Nonnull Ref<EntityStore> selfReference, @Nonnull Ref<EntityStore> target, @Nonnull Store<EntityStore> store)
- public String get()

## Inner Types

- `SensorInflictedDamage.Target`

Also in this package: ActionFlockBeacon, ActionFlockJoin, ActionFlockLeave, ActionFlockSetTarget, ActionFlockState, BodyMotionFlock, EntityFilterFlock, SensorFlockCombatDamage, SensorFlockLeader, Target

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected static boolean inSameFlock(Ref<EntityStore> selfReference, Ref<EntityStore> target, Store<EntityStore> store)

Fields:
protected final SensorInflictedDamage.Target target
protected final boolean friendlyFire
protected final EntityPositionProvider positionProvider
