# BuilderSensorKill

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorBase

public class BuilderSensorKill extends BuilderSensorBase

NPC sensor builder: Test if NPC made a kill.

## Methods

- @Nonnull public SensorKill build(@Nonnull BuilderSupport builderSupport)
- return new SensorKill(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public int getTargetSlot(@Nonnull BuilderSupport support)
