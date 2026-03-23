# BuilderSensorEntity

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorEntityBase

public class BuilderSensorEntity extends BuilderSensorEntityBase

NPC sensor builder: Test if entity matching specific attributes and filters is in range.

## Methods

- @Nonnull public SensorEntity build(@Nonnull BuilderSupport builderSupport)
- return new SensorEntity(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isGetPlayers(@Nonnull BuilderSupport support)
- public boolean isGetNPCs(@Nonnull BuilderSupport support)
- public boolean isExcludeOwnType(@Nonnull BuilderSupport support)
