# SensorBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: AnnotatedComponentBase | Implements: Sensor

public abstract class SensorBase extends AnnotatedComponentBase implements Sensor

## Fields

- protected final boolean once
- protected boolean triggered

## Constructors

- public SensorBase(@Nonnull BuilderSensorBase builderSensorBase)

## Methods

- @Override public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean isTriggered()
- @Override public boolean processDelay(float dt)
