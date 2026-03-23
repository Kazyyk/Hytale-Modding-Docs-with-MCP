# BuilderSensorTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorWithEntityFilters

public class BuilderSensorTarget extends BuilderSensorWithEntityFilters

Extends `BuilderSensorWithEntityFilters`.

## Methods

- @Nonnull public SensorTarget build(@Nonnull BuilderSupport builderSupport)
- return new SensorTarget(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public double getRange(@Nonnull BuilderSupport support)
- public boolean getAutoUnlockTarget(@Nonnull BuilderSupport support)
- public int getTargetSlot(@Nonnull BuilderSupport builderSupport)
