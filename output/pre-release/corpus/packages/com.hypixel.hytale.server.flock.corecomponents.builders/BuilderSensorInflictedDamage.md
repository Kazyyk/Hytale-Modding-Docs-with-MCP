# BuilderSensorInflictedDamage

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderSensorBase

public class BuilderSensorInflictedDamage extends BuilderSensorBase

NPC behavior sensor builder for SensorInflictedDamage functionality.

## Fields

- protected SensorInflictedDamage.Target target
- protected boolean friendlyFire

## Methods

- @Nonnull public SensorInflictedDamage build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isFriendlyFire()
- public SensorInflictedDamage.Target getTarget()
