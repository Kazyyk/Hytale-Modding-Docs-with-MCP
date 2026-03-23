# BuilderSensorPlayer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorEntityBase

public class BuilderSensorPlayer extends BuilderSensorEntityBase

NPC sensor builder: Test if player matching specific attributes and filters is in range.

## Methods

- @Nonnull public SensorPlayer build(@Nonnull BuilderSupport builderSupport)
- return new SensorPlayer(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
