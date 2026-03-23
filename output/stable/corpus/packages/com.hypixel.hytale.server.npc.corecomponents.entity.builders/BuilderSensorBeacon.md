# BuilderSensorBeacon

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorBase

public class BuilderSensorBeacon extends BuilderSensorBase

NPC sensor builder: Checks to see if any messages have been broadcasted by nearby NPCs.

## Fields

- protected String targetSlot
- protected boolean consume

## Methods

- @Nonnull public SensorBeacon build(@Nonnull BuilderSupport builderSupport)
- return new SensorBeacon(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public int getMessageSlot(@Nonnull BuilderSupport builderSupport)
- public double getRange(@Nonnull BuilderSupport builderSupport)
- public int getTargetSlot(@Nonnull BuilderSupport support)
- public boolean isConsume()
